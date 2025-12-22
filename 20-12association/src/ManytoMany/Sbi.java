package ManytoMany;

public class Sbi {
    String location;
    Addhar addhar;
    UserName userName;
    public Sbi(String location,Addhar addhar,UserName userName){
        this.location=location;
        this.addhar=addhar;
        this.userName=userName;
    }
    public void displaySbi(){
        System.out.println(location);
        System.out.println(addhar.number);
        System.out.println(userName.name);

    }
}
