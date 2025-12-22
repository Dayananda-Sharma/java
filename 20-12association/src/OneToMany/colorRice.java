package OneToMany;

public class colorRice {
    int price;
    Rice rice;
    public colorRice(int price,Rice rice){
        this.rice=rice;
        this.price=price;
    }
    public void displayRice(){
        System.out.println(rice.type);
        System.out.println(price);
    }
}
