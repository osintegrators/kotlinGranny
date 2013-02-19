kotlinGranny
============

Granny's Addressbook: Kotlin + Kara + PostgreSQL

Database instruction
1. Install PostgreSQL
2. Create database
	> sudo su postgres
	> createdb -T template0 kotlingranny
3. Create user
	> psql
	# CREATE USER kotlingranny;
	# ALTER USER drupaldbuser PASSWORD 'kotlingranny';
	# GRANT ALL ON DATABASE kotlingranny TO kotlingranny;
	# \q
4. Log in to database and create table
	> psql -U kotlingranny kotlingranny
	# create table foo (id int primary key, name varchar(100), address varchar(100), phone varchar(100), email varchar(100))");
Application Instructions
1. Install the Kara Framework from source or the binary - http://karaframework.com/docs/overview.html Add the location to your system path.
2. Install Apache
3. Clone the repository and build using ant.
4. Run kara server from your project directory
	Useful video - http://www.youtube.com/watch?v=pvzMh85_qWU

5. Copy the Granny folder to /var/www
6. Open a browser and go to http://localhost/Granny

Questions: lpinto@osintegrators.com 
