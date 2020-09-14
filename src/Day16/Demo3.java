package Day16;

class MyList{

    public static <E> void display(E[] elements){
        for(E element: elements){
            System.out.println(element);
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Integer[] intArray = {10,29,20,40,50};
        Character[] chatArray = {'A', 'C', 'D', 'E'};

        MyList.display(intArray);
        System.out.println();
        MyList.display(chatArray);
    }
}
