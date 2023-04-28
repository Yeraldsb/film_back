# Film Movie Backend :video_camera:

This is a backend project built using Kotlin, Spring Boot, and MySQL.

## Getting Started
### Prerequisites

To run this project, you will need to have the following installed:
- JDK 17
- MySQL

### instalation :alien:
-  Clone the repository
-  Open the project in your favorite IDE
-  Set up the MySQL database by modifiying your  ***appication.properties***  file located in the  ***src/main/resources***  directory
<strong>spring.datasource.url= jdbc:mysql://localhost:3306/film?useSSL=false&allowPublicKeyRetrieval=true <br></strong>
<strong>      spring.datasource.username=your_user <br> </strong>
<strong>      spring.datasource.password=your_password <br></strong>
 <strong>     spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver <br></strong>
 <strong>     spring.jpa.hibernate.ddl-auto=none <br></strong>
- Update the MySQL connection details in the application.properties file located in the src/main/resources directory
-  Build and run the project using your IDE or by running ./gradlew bootRun from the command line
  Usage

Once the project is running, you can access the following endpoints:<br>

   1.   <strong>POST /images</strong>  upload a new image to the database <br>
   2.   <strong>GET /images/{id}</strong> get an image by ID<br>
   3.   <strong>GET /images</strong> get a list of all images<br>

###  Built With :leaves:
 -  Kotlin
 -  Spring Boot
 -  MySQL
