package Day11;

import java.io.File;

/**
 *
 * exist() - to check file is
 * createNewFile() - which will create a new file
 * mkDir() - to create a directory
 *
 * isFile() - check we have file or not
 * it return true or false
 *
 * isDirectory() - check we have directory or not
 * boolean value
 *
 * list() - return string array
 *
 * length() return long
 *
 * delete() boolean
 *
 *
 * */


public class Demo4 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db");
        String[] list = file.list();
        for(String s: list){
            count++;
            System.out.println(s);
        }
        System.out.println("Total number of file and folder = "+ count);
    }
}
