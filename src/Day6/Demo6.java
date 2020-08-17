package Day6;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

}

public class Demo6 {
    public static void main(String[] args){
        Shape shape = new Rectangle();
        shape.draw();

        Circle c = new Circle();
        c.draw();
    }
}
