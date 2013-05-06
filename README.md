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

License
--------

Copyright (c) 2012 Open Software Integrators

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
