# JPAExample

JDK11 compatible

Download or git clone the project

# Edit

Open this project inside Intellij

or

Import this project as a Gradle project inside Eclipse

# Run
Launch the main program: https://github.com/charroux/JPAJUnit/blob/main/src/main/java/com/efrei/JpaJUnitApplication.java

Open the H2 web console: http://localhost:8080/h2-console

Look at the console the database URL: H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:9ed803a4-ffdc-4af0-b59d-01f04295964d'

Then copy the given url (jdbc:h2:mem:9ed803a4-ffdc-4af0-b59d-01f04295964d as an example) to the JDBC URL field.

# Inspect the database through a Web Service 

Web Service: http://localhost:8080/programmeurs

The code at the server side is: https://github.com/charroux/JPAExample/blob/master/src/main/java/com/efrei/JPAExample/RestWebService.java

# Test

Open the project into Intellij or Eclipe

Then run the test (file https://github.com/charroux/JPAJUnit/blob/main/src/test/java/com/efrei/ServiceTest.java)
