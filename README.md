# Task-Assistant

Software Installation
1.	Java should be installed
    a.	Install the JDK software
    b.	Select the appropriate JDK software and click Download.
    c.	The JDK software is installed on your computer, for example, at C:\Program Files\Java\<jdk_version>. You can move the JDK software to another location if desired.
    d.	Set JAVA_HOME:
        •	Right click My Computer and select Properties.
        •	On the Advanced tab, select Environment Variables, and then edit JAVA_HOME to point to where the JDK software is located, for example, C:\Program Files\Java\<jdk_version>
    e.	Set JRE_HOME
        •	Right click My Computer and select Properties.
    •	On the Advanced tab, select Environment Variables, and then edit JRE_HOME to point to where the JDK software is located, for example, C:\Program Files\Java\<jdk_version>\jre\
2.	Grails 2.5.0 should be installed and configured on the system.
    a.	Select 2.5.0 version of Grails and download.
    b.	Once downloaded, extract the Grails zip folder into appropriate directory, for example C:\grails on Windows or ~/grails on Unix.
    c.	Create a GRAILS_HOME environment variable that points to the path where you extracted the archive (e.g. C:\grails on Windows or ~/grails on Unix).
    d.	Append a reference to the "bin" directory within the Grails directory to your PATH variable (e.g. %GRAILS_HOME%\bin on Windows or $GRAILS_HOME/bin on Unix).
    e.	Type “grails” at the command line to check if grails is installed properly.
3.	NetBeans IDE – “All” or Grails plugin should be installed.
4.	Tomcat 8.0.35 should be installed and configured as per mentioned in Chapter 2.


Running Application

A.	Through Command line

    Create WAR file
    1.	Download the zip folder of project.
    2.	Unzip the project. 
    3.	Open cmd in the project folder location.
    4.	Type command “grails compile” and press enter.
    5.	Wait until the process completes.
    6.	Next, type "grails war CPSC476.war" command and press enter. 
    7.	This will create war file in project's root directory (not in the target or any other folder).

    Run application using created WAR file
    1.	Copy “CPSC476.war” from project’s root directory into the webapps directory of Tomcat.
    2.	Start Tomcat.
    3.	Go to Tomcat Manager at http://localhost:8080/ and click on Manager APP.
    4.	Click on / CPSC476 to access the application.

B.	Through NetBeans IDE – Creating WAR
    Create WAR file
    1.	Open NetBeans IDE.
    2.	Click on file -> Import Project -> From ZIP -> Browse to the directory where you have downloaded the ZIP folder of project -> Import. The project will be imported into the NetBeans workspace.
    3.	Sometimes, imported project is not opened automatically in the NetBeans, for that click on File -> Open Project -> Browse the location where project is imported into NetBeans workspace -> Open Project.
    4.	Right click on the project from NetBeans Project Explorer -> click on Build.
    5.	WAR file is created in the “target/” folder in the project.

    Run application using created WAR file
    1.	Copy “TaskManager.war” from project’s “target/” directory into the webapps directory of Tomcat.
    2.	Start Tomcat.
    3.	Go to Tomcat Manager at http://localhost:8080/ and click on Manager APP.
    4.	Click on /TaskManager to access the application.

C.	Through NetBeans IDE – Run command
    1.	Open NetBeans IDE.
    2.	Click on file -> Import Project -> From ZIP -> Browse to the directory where you have downloaded the ZIP folder of project -> Import. The project will be imported into the NetBeans workspace.
    3.	Sometimes, imported project is not opened automatically in the NetBeans, for that click on File -> Open Project -> Browse the location where project is imported into NetBeans workspace -> Open Project.
    4.	Right click on the project in NetBeans Project Explorer -> Run. Check console to see if the server has started. 
    5.	Access the application at browse location given in the output window http://localhost:8080/TaskManager/
