package Day11;


import java.io.FileWriter;
import java.io.IOException;

public class Demo8 {
    public static void main(String[] args) throws IOException {
        // it will first check do we have a file by this name
        //ot it will create a new file
        FileWriter fw = new FileWriter("data.txt", true);

        //fw.write(100); // single character
        fw.write("This is third message");
        fw.write("\n");
        char[] c1 = {'a', 'b', 'c'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();

    }
}
