package OneToOne;

public class EngineRunner {
    public static void main(String[] args) {
        Car car=new Car("Xuv");
        Engine engine=new Engine("petrol",car);
        engine.displayEngine();
    }
}
