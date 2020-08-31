package Day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Constructor 1
 * File file = new File(String name)
 * name can be either file or directory name
 * file will get created in current directory
 *
 * Constructor 2
 * File file = new File(String subDirectoryName, String fileName)
 * subDirectory is your desire location
 * this directory can be present in some other location
 *
 * Constructor 3
 * File file = new File(File SubDirectory, String fileName)
 *
 * */


public class Demo3 {
    public static void main(String[] args) {

        File dir = new File("db");
        dir.mkdir();

        File file = new File("db", "second.txt");
        try {
            file.createNewFile();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
