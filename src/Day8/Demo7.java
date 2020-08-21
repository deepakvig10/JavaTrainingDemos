package Day8;

interface ICar{
    void getColor();
    void getModelInfo();
}

class Audi implements ICar{
    @Override
    public void getColor() {
        System.out.println("Black");
    }

    @Override
    public void getModelInfo() {
        System.out.println("Audi: A6");
    }
}

class Honda implements ICar{

    @Override
    public void getColor() {
        System.out.println("White");
    }

    @Override
    public void getModelInfo() {
        System.out.println("Honda: City");
    }
}

class BMW implements ICar{

    @Override
    public void getColor() {
        System.out.println("Red");
    }

    @Override
    public void getModelInfo() {
        System.out.println("BMW: 5");
    }
}

class CarFactory{
    public static ICar getCarInstance(int id){
        switch (id){
            case 1:
                return new Honda();
            case 2:
                return new Audi();
            case 3:
                return new BMW();
            default:
                return null;
        }
    }
}


public class Demo7 {
    public static void main(String[] args) {
//        Honda honda = new Honda();
//        honda.getColor();
//        honda.getModelInfo();
//
//        Audi audi = new Audi();
//        audi.getColor();
//        audi.getModelInfo();

        ICar car = CarFactory.getCarInstance(2);
        car.getColor();
        car.getModelInfo();


    }
}
