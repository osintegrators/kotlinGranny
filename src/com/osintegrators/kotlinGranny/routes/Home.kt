
package com.osintegrators.kotlinGranny.routes

import com.osintegrators.kotlinGranny.views.*
import com.osintegrators.kotlinGranny.views.home.*
import kara.controllers.*

import java.sql.ResultSet
import java.sql.Connection
import com.osintegrators.kotlinGranny.jdbc.*
import kotlin.test.*
import org.postgresql.Driver
import java.sql.DriverManager
import sun.security.krb5.internal.PAData.SaltAndParams

public val connection : Connection = createConnection();

fun createConnection() : Connection {
    Class.forName("org.postgresql.Driver");
    val dataSource = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kotlingranny","kotlingranny", "kotlingranny")//Jdbc4Connection(null, "kotlingranny", "kotlingranny", null, "jdbc:postgresql://localhost:5432/kotlingranny");
    if (dataSource == null) {
        throw IllegalStateException("No DataSource created")
    } else {
        //dataSource.update("create table foo (id int primary key, name varchar(100), address varchar(100), phone varchar(100), email varchar(100))")
        return dataSource
    }
}

object Home {
    val layout = DefaultLayout()
    var uuid : Int= 1

    Post("/") class Index() : Request({
        var json=""
        connection.query("select * from foo") {
            for (row in it) {
                uuid="${row["id"]}".toInt()
                json+="{"
                json+="\"_id\":\"${row["id"]}\",";
                json+="\"name\":\"${row["name"]}\",";
                json+="\"address\":\"${row["address"]}\",";
                json+="\"phone\":\"${row["phone"]}\",";
                json+="\"email\":\"${row["email"]}\"";
                json+="},";
            }
        }
        json= if (json.length>0) json.subSequence(0, json.length()-1).toString() else json
        json="["+json+"]"
        uuid++;
        TextResult(json)
    })

    Post("/address/:i") class get(i:Int) : Request({
        var json="{"
        connection.query("select * from foo where id="+i) {
            for (row in it) {
                json+="\"_id\":\"${row["id"]}\",";
                json+="\"name\":\"${row["name"]}\",";
                json+="\"address\":\"${row["address"]}\",";
                json+="\"phone\":\"${row["phone"]}\",";
                json+="\"email\":\"${row["email"]}\"";
            }
        }
        json+="}"
        TextResult(json)
    })

    Post("/address/save/:data") class Save(data: String) : Request({
        val response = "${params["data"]}".replace('+',' ')//
        val n = "%7B%22name%22%3A%22"
        val a = "%22%2C%22address%22%3A%22"
        val p = "%22%2C%22phone%22%3A%22"
        val e = "%22%2C%22email%22%3A%22"
        val x = "%22%7D"
        val i = response.indexOf(a);
        val j = response.indexOf(p);
        val k = response.indexOf(e);
        val l = response.indexOf(x);
        val name = response.subSequence(0,i).toString().replace(n,"").replace("%2C",",").replace("%40","@");
        val address= response.subSequence(i,j).toString().replace(a,"").replace("%2C",",").replace("%40","@");
        val phone= response.subSequence(j,k).toString().replace(p,"").replace("%2C",",").replace("%40","@");
        val email= response.subSequence(k,l).toString().replace(e,"").replace("%2C",",").replace("%40","@");
        connection.update("insert into foo (id, name, address, phone, email) values ("+uuid+",'"+name+"','"+address+"','"+phone+"','"+email+"')")
        uuid++;
        TextResult("insert into foo (id, name, address, phone, email) values ("+uuid+",'"+name+"','"+address+"','"+phone+"','"+email+"')")
    })

    Post("/address/update/:id/:data") class update(id: Int, data: String) : Request({
        val response = "${params["data"]}".replace('+',' ')
        val n = "%7B%22name%22%3A%22"
        val a = "%22%2C%22address%22%3A%22"
        val p = "%22%2C%22phone%22%3A%22"
        val e = "%22%2C%22email%22%3A%22"
        val x = "%22%2C%22_id"
        val i = response.indexOf(a);
        val j = response.indexOf(p);
        val k = response.indexOf(e);
        val l = response.indexOf(x);
        val name = response.subSequence(0,i).toString().replace(n,"").replace("%2C",",").replace("%40","@");
        val address= response.subSequence(i,j).toString().replace(a,"").replace("%2C",",").replace("%40","@");
        val phone= response.subSequence(j,k).toString().replace(p,"").replace("%2C",",").replace("%40","@");
        val email= response.subSequence(k,l).toString().replace(e,"").replace("%2C",",").replace("%40","@");
        connection.update("update foo set name='"+name+"',address='"+address+"',phone='"+phone+"',email='"+email+"' where id ="+id)
        TextResult("update foo set name='"+name+"',address='"+address+"',phone='"+phone+"',email='"+email+"' where id ="+id)
    })

    Post("/address/delete/:id") class delete(id: Int) : Request({
        connection.update("delete from foo where id="+id)
        TextResult("delete from foo where id="+id)
    })
}

