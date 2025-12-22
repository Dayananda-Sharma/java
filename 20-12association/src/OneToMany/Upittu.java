package OneToMany;

public class Upittu {
    int price;
    Salt salt;
    public Upittu(int price,Salt salt){
        this.price=price;
        this.salt=salt;
    }
    public void displayUpittu(){
        System.out.println(price);
        System.out.println(salt.price);
    }
}
