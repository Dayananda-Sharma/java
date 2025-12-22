package ManyToOne;

public class Iphone {
    String IphoneName;
    Sim sim;
    public Iphone(String IphoneName,Sim sim){

        this.IphoneName=IphoneName;
        this.sim=sim;
    }
    public void displayIphone(){
        System.out.println(IphoneName);
        System.out.println("16pro"+sim.price);
    }
}
