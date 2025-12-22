package ManyToOne;

public class Android {
    String mobileName;
    Sim sim;

    public Android(String mobileName,Sim sim){
        this.mobileName=mobileName;
        this.sim=sim;
    }
    public void displayAndroid(){
        System.out.println(mobileName);
        System.out.println(sim.price);

    }
}
