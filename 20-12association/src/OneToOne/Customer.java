package OneToOne;

public class Customer {
    String name;
    String location;
    PhoneNumber phoneNumber;
    public Customer(String name,String location,PhoneNumber phoneNumber){
        this.name=name;
        this.location=location;
        this.phoneNumber=phoneNumber;
    }
    public void displayCustomer(){
        System.out.println("name"+name);
        System.out.println("location"+location);
        System.out.println("phoneNumber"+phoneNumber.number);
    }
}
