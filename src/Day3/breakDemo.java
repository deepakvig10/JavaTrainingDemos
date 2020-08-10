package Day3;

public class breakDemo {

    public static void main(String[] args){

        for(int i=0; i<10; i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }
        System.out.println("While.......");
        int i = 0;
        while(i<10){
            System.out.println(i);
            if(i==5)
                break;
            i++;
        }

        System.out.println("foreach........");
        int[] numbers = {1,2,3,4,5,6};
        for(int number : numbers){
            System.out.println(number);
            if(number==3){
                break;
            }
        }



    }

}
