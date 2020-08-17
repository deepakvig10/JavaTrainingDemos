package Day4;

import java.util.Scanner;

public class Demo2 {

    public static int squareOfNumber(int x){
        return x * x;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number =  sc.nextInt();

        int result = squareOfNumber(number);
        System.out.println("Square of "+ number + " is "+ result);


    }

}
