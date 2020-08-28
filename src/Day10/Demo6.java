package Day10;

class UserAlreadyLoggedInException extends Exception{

}

class Authentication{
    private boolean isLoggedIn = false;

    public void login(String email, String password) throws UserAlreadyLoggedInException{
        if(!isLoggedIn){
            if(email.equals("admin") && password.equals("123")){
                isLoggedIn = true;
                System.out.println("Welcome");
            }else{
                System.out.println("Incorrect details");
            }
        }else{
            throw new UserAlreadyLoggedInException();
        }

    }
}

public class Demo6 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        try {
            auth.login("admin", "123");
        } catch (UserAlreadyLoggedInException e) {
            e.printStackTrace();
        }

        try {
            auth.login("admin", "123");
        } catch (UserAlreadyLoggedInException e) {
            e.printStackTrace();
        }


    }
}
