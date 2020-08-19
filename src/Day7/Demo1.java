package Day7;

class Car{
    public void display(){
        System.out.println("Car - Display");
    }
}

class BMW extends Car{
    public void display(){
        System.out.println("BMW - Display");
    }
}

class Audi extends Car{

}
public class Demo1 {
    public static void main(String[] args){
        BMW bmw = new BMW();
        bmw.display(); //

        Audi audi = new Audi();
        audi.display();
    }
}
