***Setup MySQL using Docker***

This can be done by following this [tutorial](https://nextbreakpoint.com/posts/article-run-mysql-in-docker-container.html) by pulling the 5.6.44 version of mysql.

or 

1. run `docker pull mysql:5.6.44` to download the mysql image.
2. run `docker run --name mysqldb --restart unless-stopped -e MYSQL_ROOT_PASSWORD=mysql -p 3306:3306 -d mysql:5.6.44` to run your local mysql server at port 3306.
3. run `docker ps -a` to check if your mysql server is up.
4. run `docker exec -it mysqldb mysql -u root -p` to login into your local mysql server using your root account.
5. Once logged in, run 'create database liquibasetest;' to create a database in your local mysql server.
6. run `show databases; `to make sure you have `liquibasetest` database created.


***

***Run Server***

If MySQL is used,

1. run `docker start mysqldb` to start the copy of your local mysql server.
2. run this **DemoApplication** via Spring Boot.
3. run the following command at `src` directory  
```
liquibase --driver=com.mysql.jdbc.Driver --classpath=lib/mysql.jar --changeLogFile=changelog/db.changelog-master.xml --url="jdbc:mysql://localhost:3306/liquibasetest" --username=root --password=mysql update

```

***