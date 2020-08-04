# dynamicWebProjectJava

Technology: Java, JSP(Java Servlet Page), HTML5, CSS3, MySQL <br/>
IDE: Eclipse IDE for Enterprise Java Developers ; Version: 2020-06 (4.16.0) <br/>
JDK: 12 <br/>
JRE: 1.8.0 <br/>
Server: Apache Tomcat 8.5.57 <br/>
Database: MySQL hosted on XAMPP Control Panel

## What is this?
&nbsp;&nbsp; This repository contains practical implementation example for dynamic web project concept in java. <br/>

## Working
&nbsp;&nbsp; The project focuses on user registration on HTML page and then forwards this data to MySQL database in connection with Java Servlet.
The user again logins on a JSP page and the data is verified using previously stored data and once verified, user is redirected to a live URL.
The MySQL database is locally hosted on XAMPP Control Panel with below details:
* URL: https://localhost:3306/
* ID: root
* Password: Keep it blank as ""
* Database Name: DynamicWebProject
* Table Name: 'registration' with 5 attributes as mentioned in the program.

## Steps to run:
* Open Eclipse IDE <br/>
* Change perspective to Java EE <br/>
* Create a new "Dynamic Web Project" <br/>
**_NOTE:_** Make sure you have checked "Generate web.xml deployment descriptor" <br/>
* Create servlet pages, HTML file and JSP file. Copy paste all the codes as per below file structure. <br/>
![alt text](https://github.com/kaustubhrao47/dynamicWebProjectJava/blob/master/file-structure-dynamic-web-project.jpg?raw=true) <br/>
* Add the installed server to the project
* Run "index.html" on the server.
* Click: http://localhost:8080/DynamicWebProject/ (with 'Apache Tomcat' server and project name as 'DynamicWebProject').

## Download Links
* Apache Tomcat server: https://tomcat.apache.org/download-80.cgi
* XAMPP Control Panel: https://www.apachefriends.org/download.html
* Eclipse IDE: https://www.eclipse.org/downloads/packages/release/neon/3/eclipse-ide-java-ee-developers
* Java Development Kit: https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html
* Java Runtime Environment: https://www.oracle.com/java/technologies/javase-jre8-downloads.html

## Contributing
&nbsp;&nbsp; Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change. <br/>
&nbsp;&nbsp; Please make sure to update tests as appropriate.

## License
&nbsp;&nbsp; [MIT](https://choosealicense.com/licenses/mit/)
