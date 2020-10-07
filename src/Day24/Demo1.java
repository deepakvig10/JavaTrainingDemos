package Day24;


/***
 *
 * Spring Framework
 *
 * Spring MVC
 *
 * What is Spring MVC?
 * 1. A spring MVC is sub framework of spring framework which is used to
 *   develop a web application
 * 2. It is build using servlet API
 * 3. If follows the MVC design pattern
 * 4. It implements all the basic features of the spring core framework
 * 5. Inversion of Control, Dependency injection
 *
 *
 * Why Sping MVC?
 * 1. MVC is a design pattern which you will find in almost every programming language
 *   for example: php - cakePhp, .Net - ASP.Net MVC, Java - Spring MVC
 * 2. It help us to develop web application very quickly
 * 3. Spring MVC is flexible, easy for testing and have many features
 *
 *
 * M - model - data
 * V - View - UI
 * C - controller - request handler
 *
 *
 * Steps
 * Create a new maven project and select webapp instead of quick start
 * add only springmvc as dependency in the pom.xml
 *
 *
 * One of most important part of spring mvc application is to do the
 * configuration correctly
 * There are simple 5 steps involve in configuration
 *
 * 1. Configure the dispatcher servlet in web.xml
 * 2. Create spring configuration file
 * 3. Configure View Resolver
 * 4. Create Controller
 * 5. Create a view or page
 *
 * # Sending data from controller to view
 * model to pass data from controller to view
 *
 *
 * Model / ModelAndView
 *
 *
 * # Model
 * addAttribute(String key, Object value)
 * addAttribute("name", "Marm Smith")
 *
 * # ModelAndView
 * addObject(String key, Object value)
 *
 *
 *
 * # Send the data from view to controller
 *
 *  HTTP 4 verbs
 *
 *  Get - read
 *  Post - insert
 *  Put - update
 *  Delete - delete
 *
 *
 *  HTML form -> post
 *
 *
 * @RequestMapping Annotation
 * path
 * method
 *
 *
 *
 *
 *
 * www.domain.com/home
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
