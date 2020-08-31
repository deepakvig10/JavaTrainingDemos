package Day11;

import java.io.*;

/**
 * FileWrite()
 * BufferWrite()
 * PrinterWriter()
 *
 *
 * FileWriter
 *
 * If our specified file doesnot exist will not get any exception
 * The constructor of the fileWriter will create a new file
 *
 * Constructor 1
 * FileWriter fw = new FileWriter(String filename)
 *
 * Constructor 2
 * FileWriter fw = new FileWriter(File file)
 *
 * Note: What will happen if we already have data in the file?
 * by default it will perform override
 * override - clear previous data and re write
 * append - add data in existing
 *
 * Constructor 3:
 * FileWriter fw = new FileWrite(String filename, boolean append)
 * true - append
 * false - overwrite
 *
 * Constructor 4:
 * FileWrite fw = new FileWriter(File file, boolean append)
 * true - append
 * false - overwite
 *
 *
 * write(int cha)
 * write(char[] cha)
 * write(String s)
 *
 *
 * fw.flush()
 * gives us a kind of gaurantee that all the character we have passed from the programe
 * transfered to the file including last character
 *
 * fw.close()
 *
 *
 * */

public class Demo7 {
    public static void main(String[] args) throws IOException {
        // it will first check do we have a file by this name
        //ot it will create a new file
        FileWriter fw = new FileWriter("data.txt");

        fw.write(100); // single character
        fw.write("This is some message");
        fw.write("\n");
        char[] c1 = {'a', 'b', 'c'};
        fw.write(c1);
        fw.write("\n");

        //fw.flush();
        //fw.close();

    }
}
