package Day12;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fo = new FileOutputStream("data.txt");
        char a = 'a';
        String b = "hello world";
        fo.write(b.getBytes());
        System.out.println("data is saved");
        fo.flush();
        fo.close();
    }
}
