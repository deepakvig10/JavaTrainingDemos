package Day12;

import java.io.*;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("a.txt");
        FileOutputStream fo = new FileOutputStream("b.txt");

        int data;
        while((data = fi.read())!=-1){
            fo.write(data);
        }
        System.out.println("file copied");
        fi.close();



    }
}
