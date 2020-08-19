package Day7;

interface Shapes{
    void draw();
    double getArea(int w, int h);
}

class Rectangle implements Shapes{

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public double getArea(int w, int h) {
        return w  * h;
    }
}


public class Demo12 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.draw();
        System.out.println(r.getArea(10, 20));
    }

}
