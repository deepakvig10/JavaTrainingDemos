package Day11;

import java.io.File;

public class Demo6 {
    public static void main(String[] args) {
        File file = new File("db");
        file.delete();
    }
}
