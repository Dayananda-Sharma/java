package OneToMany;

public class TamotoBath {
    int price;
    Salt salt;
    public TamotoBath(int price,Salt salt){
        this.price=price;
        this.salt=salt;
    }
    public void displayTamoto(){
        System.out.println(price);
        System.out.println(salt.price);
    }
}
