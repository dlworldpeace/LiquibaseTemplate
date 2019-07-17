0. pg_ctl.exe restart -D  "D:\PostgreSQL\data"
1. services.msc
2. start or stop Postgres\[-version\]
3. liquibase --driver=org.postgresql.Driver --classpath=lib/postgresql.jar --changeLogFile=changelog/db.changelog-master.xml --url="jdbc:postgresql://localhost:4321/postgres" --username=postgres --password=postgres migrate
4. make liquibase.property file 