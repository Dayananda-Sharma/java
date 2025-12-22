package OneToOne;

public class Engine {
    String engineType;
    Car car;
    public Engine(String engineType,Car car){
        this.engineType=engineType;
        this.car=car;
    }
    public void displayEngine(){
        System.out.println("engine"+engineType);
        System.out.println("car"+car.carName);
    }
}
