package Day9;

import java.io.File;

/**
 * Exception Heirarchy
 *
 * Throwable -> Java.lang
 * Throwable is a class which have two child class
 * 1. Error
 * 2. Exception
 *
 * Exception -> RunTimeException -> Which has other run time exception child class
 * like Arthimatical / IndexOutofBounds / NullPointer
 *
 * Exception -> SQLException / IOException / Interrupted
 *
 *
 *
 * */


public class Demo2 {

    public static void main(String[] args) {

        // Checked Exception
//        File obj = new File("data.txt");
//        String data = obj.getName();


        // Runtime / Uncheck Exception
        System.out.println(100/0);


    }
}
