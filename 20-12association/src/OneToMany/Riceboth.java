package OneToMany;

public class Riceboth {
    int price;
    Rice rice;
    public Riceboth(int price,Rice rice){
        this.price=price;
        this.rice=rice;
    }
    public void displayBoth(){
        System.out.println(price);
        System.out.println(rice.type);
    }
}
