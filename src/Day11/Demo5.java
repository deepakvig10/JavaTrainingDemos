package Day11;

import java.io.File;

/**
 * isFile() - true / false
 *
 * */

public class Demo5 {
    public static void main(String[] args) {
        int count = 0;
        File file= new File("db");
        String[] list = file.list();
        for (String s: list){
            File f = new File(file, s);
            if(f.isFile()){
                count++;
                System.out.println(s);
            }

        }
    }
}
