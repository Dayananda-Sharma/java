package OneToOne;

public class CustomerRunner {
    public static void main(String[] args) {
        PhoneNumber phoneNumber=new PhoneNumber(776094884);
        Customer customer=new Customer("Daya","hiriyur",phoneNumber);
        customer.displayCustomer();

    }
}
