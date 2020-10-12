package Day26;


/**
 * What is Testing?
 *
 * Testing is all about testing our code before publishing
 * We can identify the bug at early stage which help to fix them before moving to production server
 * As a Developer we will be more confident about the work we did
 *
 *
 * # Type of Testing?
 * 1. Unit Testing
 * 2. Integration Testing
 * 3. End to End to Testing
 *
 * # Unit Testing
 * Testing of the smallest unit of the application
 * Unit can be a function where we test the function and verfiy are we getting the out per as per the expection
 * ot not
 * In unit testing we test the function in the isolation
 * we try to test as much as fucntion as possible with all possible scenarios
 *
 *
 * # Integartion testing
 * In integration testing we test the more than one component or fucntion and verify the output
 * for example if one of function make a external call then we have to verify is the fucntion intergating or
 * communicating with the service correctly or not
 *
 *
 * # End to End Testing
 * In the e2e we have to test the entire application as the whole
 * where we have to test the each and every fucntionality of the application
 *
 *
 * Unit Testing
 * 1. Easy and simple
 * 2. Done in the isolation
 * 3. less time consuming
 * 4. expected from the developer
 * 5. make the developer more confident
 *
 *
 * Integration testing
 * 1. little time consuming
 * 2. depend upon the requirement
 *
 *
 * End to End testing
 * 1. Expensive
 * 2. Time consuming
 * 3. Need expert advice
 *
 *
 * # Manual Testing Vs Automated Testing
 *
 * 1. Manual testing is Time consuming and some time tesious on the other hand in the automated testing
 *    it is fast and can be resuse or perform testing multiple times
 * 2. Huge investment in human resource on the other hand less investment
 * 3. Manual testing lot of human activity or action involev so we can be sure of the output and in automated
 *    testing the output or result is more reliable
 *
 * # jUnit
 * JUnit is very popular testing framework used in java programming language
 *
 *
 * # Features
 * 1. JUnit is an open source framework which is used for writing the test case
 * 2. JUnit provide annotations to identify test method @test
 * 3. It also provide assertion library or method to assert and compare the output
 * 4. Provides all the classes and method to write and run the test case
 *
 *
 * Tripe A Rule
 * Is the golden rule of unit testing
 * A - Arrange
 * A - Act
 * A - Assert
 *
 *
 * Arrange - Arranging the resources creating the instance of the class which method we want to test
 * Calulator cal = new Calculaor();
 *
 *
 * Act - Calling the method which we want to test and passing argument if required
 * actualResult =  cal.add(10, 20)
 *
 * Assert - comparing the output
 * expectedResult = 30
 * expectedResult == actualResult
 *
 * if equal test pass
 * if not test fail
 *
 *
 * class Calculator {
 *   Add(a, b)
 * }
 *
 *
 *
 * Annotations for JUnit
 *
 * @Test annotation spcifies that this method is a test method
 *
 * @Befor annotation specifies that method will be invoked before each test
 * @After annotation specifies that method wiill be invoked after each test
 *
 * @BeforeClass annotation specifies that method will be invoked only once before all the tests.
 *
 * @AfterClass annotation specifies that method will be invoken only once after all the tests.
 *
 *
 *
 * assertEquals()
 * assertTrue()
 * assertFalse()
 * assertNull()
 * assertNotNull()
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
