package Day8;

class DbHelper{

    private String firstName;
    private String lastName;

    private void connect(){
        System.out.println("Database connected");
    }

    private void disconnect(){
        System.out.println("Database disconnected");
    }

    public void addEmployee(String f, String l){
        connect();
        firstName = f;
        lastName = l;
        disconnect();
    }

}

public class Demo11 {
    public static void main(String[] args) {
        DbHelper dbHelper = new DbHelper();
        dbHelper.addEmployee("mark", "smith");
    }
}
