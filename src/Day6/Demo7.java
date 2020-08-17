package Day6;

abstract class Dimension{
    double width;
    double height;
    double radius;
    double breadth;
    final float pi = 3.14f;

    abstract double getArea();
}

class Rectangle2 extends Dimension{

    public Rectangle2(double w, double h){
        this.width = w;
        this.height = h;
    }


    @Override
    double getArea() {
        return width * height;
    }
}

class Circle2 extends Dimension{

    public Circle2(double r){
        this.radius = r;
    }



    @Override
    double getArea() {

        return pi * radius * radius;
    }

}

class Cone extends Dimension{

    @Override
    double getArea() {
        return 0;
    }
}


public class Demo7 {

    public static  void main(String[] args){
        Rectangle2 r = new Rectangle2(12.34, 56.78);
        Circle2 c = new Circle2(55.55);

        System.out.println("Area: "+ r.getArea());
        System.out.println("Area: "+ c.getArea());
    }

}
