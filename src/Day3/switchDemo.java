package Day3;

public class switchDemo {

    public static void main(String[] args){

        int number = 5;

//        switch (number){
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Not on the list");
//                break;
//
//        }

        String numberInWords = "One";

        switch (numberInWords){
            case "One":
                int c = 1;
                switch (c){
                    case 1:
                        System.out.println("nested switch 1");
                        break;
                    case 2:
                        System.out.println("nested switch 2");
                        break;

                }
                System.out.println(1);
                break;
            case "Two":
                System.out.println(2);
                break;
            default:
                System.out.println("not in the list");
        }

    }
}
