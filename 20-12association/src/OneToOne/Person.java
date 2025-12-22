package OneToOne;

public class Person {
    String personName;
    String location;
    long number;
    Passport passport;
    public Person(String personName ,String location ,long number,Passport passport){
        this.personName=personName;
        this.location=location;
        this.number=number;
        this.passport=passport;
    }
    public void displayPerson(){
        System.out.println("personName"+personName);
        System.out.println("location"+location);
        System.out.println("number"+number);
        System.out.println("passport"+passport);
    }
}
