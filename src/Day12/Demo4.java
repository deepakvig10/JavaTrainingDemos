package Day12;

import java.io.*;

/**
 * Write a data from text file
 * <p>
 * 1. import java.io package
 * 2. create object of FileOutputStream
 * 3. invoke write(data) to write data
 * 4. invoke flush() to flush data into text file
 * 5. invoke close() to close the connection
 * 6. handle exception (FileNotFound , IOException)
 * <p>
 * <p>
 * Read a data from text file
 * 1. import java.io package
 * 2. create object of fileInputStream
 * 3. invoke read() for reading data
 * 4. invoke close() for closing connection
 * 5. handle exception (FileNotFound, IOException)
 * <p>
 * <p>
 * FileOutStream has 5 constructors
 * Constructor 1:
 * FileOutputStream(String filename) throws FNF
 * <p>
 * Constructor 2:
 * FileOutputStream(File file) throws FNF
 * <p>
 * Constructor 3:
 * FileOutputStream(String fileName, boolean true|false)
 * true - append
 * false - override
 * <p>
 * Constructor 4:
 * FileOutputStream(File file, boolean true|false)
 *
 * fis.read()
 * return the given byte available in the file
 * if there is no byte avialble in the file return -1
 *
 */


public class Demo4 {
    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        file.createNewFile();

        FileInputStream fis = new FileInputStream(file);
        int data1 = fis.read();
        int data2 = fis.read();
        int data3 = fis.read();


        System.out.println("Data1: " + (char) data1);
        System.out.println("Data2: " + (char) data2);
        System.out.println("Data3: " + data3);
        fis.close();


    }
}
