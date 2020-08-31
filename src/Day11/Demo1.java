package Day11;

import java.io.*;

/***
 * Java I/O (Input and Output)
 * We can perform file handling task in java using Java I/O API
 *
 * File
 *
 * This line will not create an physical file
 * It will first check any file with this name available or not
 * If it is available then it will refer to that file
 * If not then we are just creating java file object to represent data.txt
 *
 *
 * file.exists()
 * return boolean value
 * true - if file exist
 * false - if file doesnot exist
 *
 * file.createNewFile()
 *
 *
 * */


public class Demo1 {
    public static void main(String[] args) {

        File file = new File("data.txt");
        System.out.println(file.exists());

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());


    }
}
