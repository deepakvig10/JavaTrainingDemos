package Day4;

public class Demo5 {

    public static void main(String[] args){

        // declare
        int[] a = new int[5];

        int b[] = new int[5];

        // declare and init
        int[] c = { 1,2,3,4,5 };

        int[][] x = new int[5][5]; // 4*5*5



        int[] d = new int[]{1,2,3,4,5};

        int[] numbers = { 10,20,30,40,50 };
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("----------");

        for (int number : numbers){
            System.out.println(number);
        }



    }

}
