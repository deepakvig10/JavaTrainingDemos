package Day11;
import java.util.Scanner;

class Boxes{
    public static int volume(int [][] arr1){
        int sum=0;
        for (int i = 0; i < 3; i++) {
            int mul=1;
            for (int j = 0; j < 3; j++) {
                mul= mul*arr1[i][j];
            }
            sum=sum+mul;
        }
        System.out.println("Total Volume of all these three Boxes is: "+sum);
        return sum;

    }
}
 class VolOfAllBoxesQues5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the length, breadth and height of all three boxes, Press Enter after each value:");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3; j++)
            {
                arr1[i][j] = s1.nextInt();
            }
            System.out.println();
        }
        System.out.println("Three boxes Arrays are now represented as:");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3; j++)
            {
                System.out.print(arr1[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();
        Boxes.volume(arr1);

    }

}