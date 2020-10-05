package Day23;


/**
 * Spring
 *
 * Spring is Framework it is also know as Framework of Framework
 * Spring is the most popular application development framework for enterprise in Java
 * Spring is framework is an open source Java platform
 * Spring is consider to be lightweight framework
 * with out of the box depenency management system
 *
 *
 * Spring Core
 * Spring MVC
 * Spring Cloud
 * Spring Security
 * Spring Boot
 *
 *
 * Java  -------------> Spring Boot ----------> Spring
 *
 *
 * Spring Features
 * 1. POJO classes which make easier to manage entities
 * 2. Modular
 * 3. Intergration of other existing framework easy
 * 4. Hight Testabilty
 * 5. Web MVC
 * 6. Central Exception Handing
 * 7, Light weight
 *
 *
 * # Dependency Injection
 * Dependency injection is a design pattern which decouple the dependent classes from
 * the main class, It re ove the responsibility of creating the object of all depent
 * class from main class.
 * It make us easy to manage depency easy
 *
 *
 * # IOC Container
 * IOC container is responsible to instantiate, configure and assemble the objects of
 * the class
 * IOC container will get all information from the xml file and it will work
 * accordingly
 *
 * > Instantiate the classes
 * > Configure the object
 * > Maintain the life cycle of the object
 * > provide the object of the class whenever require
 *
 * THer are two type of IOC container
 * 1. BeanFactory
 * 2. ApplicationContext
 *
 *
 * # How to create spring application
 * there are three commonly use ways we can create a spring application
 * 1. sprint.starter.io
 * 2. mavan project
 * 3. Spring Editor
 *
 *
 * Pre requisite
 * 1. Eclipse / Netbeans / intelliJ
 * 2. TomcatServer
 * 3. MySql for database
 * 4. phpmyadmin / workbench
 *
 *
 * # Steps
 * 1. create a maven project
 * 2. Adding dependencies -> spring core and Spring context
 * 3. creating beans or POJO class
 * 4. create a configuration file -> config.xml
 * 5. Setting Injection
 * 6. Main class which will be execution point for the application
 *
 *
 *
 *
 *
 *
 *
 * <bean class="com.thevarungupta.springdemo.Student" name="student1">
 * 	<property name="studentId">
 * 		<value>101</value>
 * 	</property>
 * 	<property name="studentName">
 * 		<value>Mark</value>
 * 	</property>
 * 	<property name="studentEmail">
 * 		<value>m@gmail.com</value>
 * 	</property>
 * </bean>
 *
 *
 *
 *
 <bean class="com.thevarungupta.springdemo.Student" name="student1">
 <property name="studentId" value="101">

 </property>
 <property name="studentName" value="mark1">

 </property>
 <property name="studentEmail" value="m1@gamil.com">

 </property>
 </bean>


 // using p schema
 <bean class="com.thevarungupta.springdemo.Student" name="student2">
 <property name="studentId" value="102">

 </property>
 <property name="studentName" value="Paul">

 </property>
 <property name="studentEmail" value="p1@gamil.com">

 </property>
 </bean>
 *
 *
 *context
 *
 <bean class="com.thevarungupta.springdemo.Student" name="student1"
 p:studentId="101" p:studentName="mark" p:studentEmail="m@gmail.com"/>
 *
 *
 * collection beans
 *
 <bean name="emp" class="com.thevarungupta.springdemo.Employee">

 <property name="name" value="stacy"/>
 <property name="emails">
 <list>
 <value>s1@gmail.com</value>
 <value>s2@gmail.com</value>
 <value>s3@gmail.com</value>
 </list>
 </property>
 <property name="address">
 <set>
 <value>delhi</value>
 <value>mumbai</value>
 </set>
 </property>
 <property name="departments">
 <map>
 <entry key="admin" value="101" />
 <entry key="hr" value="102" />
 </map>
 </property>

 </bean>
 *
 *
 * Reference type
 *
 * Department
 *      Employee
 *
 *
 * A -> B
 *
 *
 *
 *
 *
 * **/

class Tyre{
    public Tyre(int type){
        System.out.println("Tyre object created...");
    }
}

class Engine{
    public Engine(int a){
        System.out.println("Engine object created...");
    }
}

class SpringIoc{

}


class Car{

    Engine engine;
    Tyre tyre;

    public Car(Engine e, Tyre t){
//        engine = new Engine();
//        tyre = new Tyre();
            this.engine = e;
            this.tyre = t;
    }

}





public class Demo1 {





}
