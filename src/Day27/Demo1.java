package Day27;

/**
 * Unit Testing
 * It is all about testing our application unit by unit
 * Testing smallest unit of our application
 * Testing methods in isolation with dependency
 *
 * # Different type of testing
 * 1. Unit Testing
 * 2. Integartion Testing
 * 3. End to end testing
 *
 *
 * # JUnit
 * Junit is a Unit testing framework which is open source and easy to learn
 *
 * JUnit version
 * 3.x legacy engine
 * 4.x
 * 5.x -> Jupiter engine
 *
 *
 * JUnit Runtime Components
 * 1. Junit Jupiter Engine
 * 2. JUnit Vintage Engine
 * 3. Integration (Mock..etc)
 *
 * JUnit Platform Runtime
 * It provides test class object and methods
 *
 *
 *
 * # Junit
 * 1. Annotations
 * @Test - use to define test method
 * @DisplayName - use to provide more readable name to our test method
 * @BeforeEach - use to execute any logic per test method before starting it
 * @AfterEach - use to execute any logic per test method after ending it
 * @BeforeAll- use to execute any logic once before starting all test
 * @AfterAll - use to execute any logic once after finishing all test
 * @TestMethodOrder - use to decide the sequence or order of the test methods (Random / OrderNumber / Alphanumeric)
 * @RepeatedTest - use to execute a test method multiple time
 * @Disabled - use to ignore a specific test method
 *
 * TestInfo we can pass this as an argument to my test method which
 * give the test method information at run time
 *
 * @RepeatedTest(value = 5, name= "{displayName} - {currentRepetition}/{totalRepetitions}")
 *
 * @Tag - ise to filter test method for including and excluding in different
 *       enviornement
 *       suppose some method may not relavent in the production env
 *       so i dont want to run them in development env
 *
 *
 *       either we can update configuration
 *       or use maven plugin
 *
 *        <build>
 *   <plugins>
 *   	<plugin>
 *   	<groupId>org.apache.maven.plugins</groupId>
 *     <artifactId>maven-surefire-plugin</artifactId>
 *     <version>3.0.0-M5</version>
 *     <configuration>
 *     	<group>dev</group>
 *     	<excludedGroups>prod</excludedGroups>
 *     </configuration></plugin>
 *   </plugins>
 *   </build>
 *
 * we have different type of env
 * dev
 * pro
 * staging
 * QA
 *
 *
 * 2. Assert API
 * It is used to validate my test is PASS or Fail
 * Provide all the method which we may require to test
 *
 * https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
 *
 * assertEquals - we can use to compare actual value with expected value
 * if both are same test pass else fail
 *
 *
 * assertNotNull()
 * assertSame()
 * assertTrue()
 * assertFalse() boolen value is expected false else test fail
 * assertThrows()
 * assertAll() this is use to group all assert test methods amd execute once
 * if all are pass then test is pass, else fail
 *
 * assertArrayEqual() - use to comparing the array (value or length)
 *
 *
 *
 *
 * ***/




public class Demo1 {
}
