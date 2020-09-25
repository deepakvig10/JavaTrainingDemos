package Day20;

/**
 *
 * Hibernate
 *
 * 1. Hibernate is an ORM (Object Relationship Mapping) framework
 * 2. Hibernate ORM is an object relational mapping library for the java language
 * 3. Which provide a framework for mapping an object oriented domain models to
 *    traditional relational database
 * 4. Hibernate is free
 * 5. Hibernate generates the sql statements.
 * 6. User need not to write sql statements
 * 7. Hibernate reduces the development time
 *
 *
 * JDBC vs Hibernate
 * JDBC
 * 1. SQL queries are database specific
 * 2. Implementing java cache is required
 * 3. If we use JDBC then switching database is tough
 * 4. Developers have to write code to map tables and java object
 *
 *
 * Hibernate
 * 1. Hibernate is database independent
 * 2. Hibernate provide automatic mechanism
 * 3. Changing database can be done by make a change in single file
 * 4. Hibernate provides an easy way to map our java object into database tables
 *
 * Hibernate
 * It is developed on top of JDBC
 * Business object can directly access data object instead of tables
 * We can manage transaction like Commit() and Roolback()
 *
 *
 * Java----> Hibernate------> database
 *
 * # Steps
 * 1. Create a maven project
 * 2. Explore the pom.xml
 *    maven is a built tool for our java application
 *    this is the xml file used by maven to manage all the dependencies
 * 3. search for hibernate maven and add this as a dependency
 *    in pom.xml under <dependencies></dependencies>
 * 4. select the project and click update project to or sync all
 *    dependencies
 *
 * 5. create hibernate configuration xml file write all the configuration
 *    for the database connection
 *
 * 6. main method we have load the hibernate configuration and use the conf
 *    to create a session
 *
 * Basic annotation provided by hibernate
 * @Entity
 * @Table(name = "")
 * @Id
 * @GeneratedValue
 * @Column()
 *
 *
 *
 * get vs load
 * both the function can be use to fetch the data
 * get() method return null
 * load() method throw the exception
 *
 *
 *
 *
 * **/


public class Demo1 {
}
