package Day7;


/**
 * final variable value cannot be change
 * static variables value can be change
 *
 * final variable can be access using object of the class
 * static variable or method can be access by class name
 * */


class Endpoint{

    private static final String BASE_URL = "http://localhost:3000/api/";
    private static final String URL_EMPLOYEE = "employee";
    private static final String URL_USER = "user";

    public static String getEmployee(){
        return BASE_URL + URL_EMPLOYEE;
    }

    public static String getUser(){
        return BASE_URL+ URL_USER;
    }

}


public class Demo7 {
    public static void main(String[] args){
        String url = Endpoint.getEmployee();
        System.out.println(url);

    }
}
