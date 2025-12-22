package ManytoMany;

public class Hdfc {
    String location;
    Addhar addhar;
    UserName userName;
    public Hdfc(String location,Addhar addhar,UserName userName){
        this.location=location;
        this.addhar=addhar;
        this.userName=userName;
    }
    public void displayHdfc(){
        System.out.println(location);
        System.out.println(addhar.number);
        System.out.println(userName.name);

    }
}
