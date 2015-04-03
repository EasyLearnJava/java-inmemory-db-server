# java-inmemory-db-server
This eclipse maven project explains how to create an inmemory temporary databse 
***

* CreateInMemoryServer.java --> run this class to create an in memory database, which runs at the below specified URL 
```
jdbc:h2:tcp://localhost:9092/mem:ATHENA
```
<b>ATHENA --></b> in memory database name
***

* Use the below parameters to connect to the in memory DB, created in the above scenario
```
DB_DRIVER = "org.h2.Driver";
DB_URL = "jdbc:h2:tcp://localhost:9092/mem:ATHENA;DB_CLOSE_DELAY=-1";
DB_USER = "";
DB_PASSWORD = "";
```
<b>DB_CLOSE_DELAY=-1 --></b> To persist the data till that JVM instance exists, Once the JVM instance is closed the data will be lost
***

* <b>PingServer.java --> </b> run this class to test if the server is running 
***

For more information visit     
<http://www.h2database.com/html/main.html>
