___Setup MySQL using Docker___

This can be done by following this [tutorial](https://nextbreakpoint.com/posts/article-run-mysql-in-docker-container.html) by pulling the 5.6.44 version of mysql.

or 

1. run `docker pull mysql:5.6.44` to download the mysql image.
2. run `docker run --name mysqldb --restart unless-stopped -e MYSQL_ROOT_PASSWORD=mysql -p 3306:3306 -d mysql:5.6.44` to run your local mysql server at port 3306.
3. run `docker ps -a` to check if your mysql server is up.
4. run `docker exec -it mysqldb mysql -u root -p` to login into your local mysql server using your root account.
5. Once logged in, run `create database liquibasetest;` to create a database in your local mysql server.
6. run `show databases; `to make sure you have `liquibasetest` database created.


***

___Test Changes Locally Before Making Commit___

1. run `docker start mysqldb` to ensure your local mysql server is running.
2. At `home` directory, run `mvn liquibase:tag -Dliquibase.tag=initial` to create a liquibase tag.
3. run `mvn liquibase:update` to execute all changesets.
4. run `mvn liquibase:rollback -Dliquibase.rollbackTag=initial` to revert all changesets.

***

___Continuous Integration___

1. run `docker start mysqldb` to ensure your local mysql server is running.
21. run this **DemoApplication** to start build via Spring Boot.