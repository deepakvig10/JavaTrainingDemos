package Day16;

import java.util.ArrayList;
import java.util.List;

/**
 * Wild card in generics
 * ? symbol which represent the wildcard element
 * it means it can use any type
 * I want to restrict any class who extended from the share class can only
 * be use in my generic method
 * Rectangle and Circle
 *
 *
 * **/

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing circle....");
    }
}

class Triangle {
    void draw(){
        System.out.println("Drawing triangle...");
    }
}

class GenericDrawing{
    public static void drawing(List<? extends Shape> list){
        for(Shape s: list){
            s.draw();
        }
    }
}


public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());

        ArrayList<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());

        ArrayList<Triangle> list3 = new ArrayList<>();
        list3.add(new Triangle());

        GenericDrawing.drawing(list1);
        GenericDrawing.drawing(list2);
        //GenericDrawing.drawing(list3);
    }
}
