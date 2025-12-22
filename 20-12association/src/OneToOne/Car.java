package OneToOne;

public class Car {
    String carName;
    public Car(String carName){
        this.carName=carName;
    }
    public void displayCar(){
        System.out.println("carName"+carName);
    }
}
