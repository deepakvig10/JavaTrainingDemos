package Day5;

import sun.tools.asm.CatchData;

class Car{

    String name;
    String color;
    int price;
    String engineType;

    public Car(String name, String color, int price, String engineType){
        this.name = name;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }

    public Car(Car obj){
        this.name = obj.name;
        this.color = obj.color;
        this.price = obj.price;
        this.engineType = obj.engineType;
    }

    public Car(Car obj, int price){
        this.name = obj.name;
        this.color = obj.color;
        this.price = price;
        this.engineType = obj.engineType;
    }

    public void getName(){
        System.out.println(name);
    }

}


public class Demo5 {

    public static void main(String[] args){
        Car car1 = new Car("Audi", "White", 1000, "Petrol");

        Car car2 = new Car(car1);
        Car car3 = new Car(car1, 10);


        car1.getName(); // Audi
        car2.getName();  // Audi

    }

}
