package Day11;

import java.io.File;
import java.io.IOException;

/**
 *
 * In UNIX everything is a file
 * even directory are also know as file
 * java file system based on unix
 * File class can be use to work with either file or directory
 *
 * **/


public class Demo2 {
    public static void main(String[] args) {

        File file = new File("db");
        System.out.println(file.exists());

        file.mkdir();


    }
}
