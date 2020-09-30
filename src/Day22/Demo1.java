package Day22;

/**
 * Servlets
 *
 * > Java Servlets are program that run on web or application server
 * > It can act as a middle layer between client and server
 * > Client or browser will make a request which will process by the server
 * > We can use servlets to collect some data from the user by creating
 *   web form and then we can process the data or save in the database
 *   with the help of servlets
 *
 *
 * Features
 * 1. Servlets provide better performance
 * 2. Servlets execute the java code on server
 * 3. Servlets are platform independent they are written in java
 * 4. Servlets are consider secure
 *
 *
 * Servlets is a simple java programe that runs on server and capable
 * of handling request and generating dynamic response.
 *
 *
 * # Install Apache Tomcat
 *
 * # Create a new project in eclipse
 *
 * New -> Dynamic
 * Project Name:
 * Runtime -> Apache
 * Version -> 4.0
 *
 *
 * There are two main folder where we mostly code
 * 1. Java Resource -> src -> here we will create our java files
 * 2. Web Content -> WEB INF -> will have html and xml or conf files
 *
 *
 * # How to create servlet are
 * There 3 ways we can create servlets
 * 1. using Servlet interface
 * 2. extending from GenericServlet class
 * 3. extending HttpServlet class
 *
 *
 * # creating a servlet using Servlet interface
 * there is a namespace javax.servlet.Servlet
 *
 * this interface provide 5 method which we need to override
 * 1. init()
 * 2. getServletConfig()
 * 3. service()
 * 4. getServletInfo()
 * 5. destroy()
 *
 * Life cycle method
 * init() + service() + destroy() = life cycle method of the servlet
 *
 * getServletConfig() + getServletInfo()
 *
 *
 * 1. servlet interface we have provide the body of all 5 methods
 *
 * 2. GenericServlet class which already the body of 4 method except
 *   service
 *
 * 3. HttpServlet
 *
 * doGet()
 * doPost()
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * ***/

public class Demo1 {
}
