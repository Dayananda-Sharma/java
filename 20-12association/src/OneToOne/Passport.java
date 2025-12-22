package OneToOne;

public class Passport {
    long passportNumber;
    public Passport(long passportNumber){
        this.passportNumber=passportNumber;

    }
    public void displayPassport(){
        System.out.println("passport"+passportNumber);
    }
}
