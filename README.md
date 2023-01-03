## Workshop 11

1. Compile Mavern project
```
mvn compile
```

2. Package Mavern project
```
mvn package
```

3. Run Spring-boot locally
```
mvn spring-boot:run
```

4. Clean up the mavern project
```
mvn clean -> remove target folder
```

5. Login to railway, this will launch your browser
```
railway Login
```

6. Init your project to enable railway
```
railway Init
```

7. Change the JDK version under pom.xml (change to 11)
    <properties>
		<java.version>11</java.version>
	</properties>

8. Push to railway site
```
railway up
```

9. Click on the launched project
```
click the project in the middle area
```

10. Go to settings and generate domain

---Extra Stuff---
1. Spring boot port config / Arguments with mvn
```
mvn spring-boot:run -Dspring-boot.run.arguments=--port=8084
```
2. Setting the port number
```
set APP_PORT=8090
```
