***Setup MySQL using Docker***

This can be done by following this [tutorial](https://nextbreakpoint.com/posts/article-run-mysql-in-docker-container.html) by pulling the 5.6.44 version of mysql.

***

***Run Server***

If MySQL is used,

1. run `docker start mysqldb` to start the copy of server.
2. run `docker exec -it some-mysql mysql -u root -p` to login to the server.
3. run the following command at `src` directory.
```
liquibase --driver=org.postgresql.Driver --classpath=lib/postgresql.jar --changeLogFile=changelog/db.changelog-master.xml --url="jdbc:postgresql://localhost:4321/postgres" --username=postgres --password=postgres migrate
```

***