package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Demo5 {
    public static void main(String[] args) throws FileNotFoundException , IOException {
        FileInputStream fs = new FileInputStream("data.txt");
        int data;

        while((data=fs.read())!=-1){
            System.out.print((char)data);
        }
        fs.close();
    }
}
