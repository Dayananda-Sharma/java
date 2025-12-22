package OneToOne;

public class PhoneNumber {
    long number;
    public PhoneNumber(long number){
        this.number=number;
    }
    public void displayPhoneNumber(){
        System.out.println("number"+number);
    }
}
