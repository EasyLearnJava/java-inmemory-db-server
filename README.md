# java-inmemory-db-server
This eclipse maven project explains how to create an inmemory temporary databse 

1) CreateInMemoryServer.java --> run this class to create an in memory database, which runs at the below specified URL 
```
jdbc:h2:tcp://localhost:9092/mem:ATHENA
```
'ATHENA --> in memory database name'

2) Use the below parameters to connect to the in memory DB connected in the above scenario
```
DB_DRIVER = "org.h2.Driver";
DB_URL = "jdbc:h2:tcp://localhost:9092/mem:ATHENA;DB_CLOSE_DELAY=-1";
DB_USER = "";
DB_PASSWORD = "";
```
'DB_CLOSE_DELAY=-1 --> To persist the data till that JVM instance exists, Once the JVM instance is closed the data will be lost'

For more information visit
http://www.h2database.com/html/main.html
