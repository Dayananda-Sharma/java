package ManyToOne;

public class Sugar {
    int price;
    Tea tea;
    Coffe coffe;
    public Sugar(int price,Tea tea ,Coffe coffe){
        this.price=price;
        this.tea=tea;
        this.coffe=coffe;
    }
    public void displayTea(){
        System.out.println("tea"+tea);
        System.out.println("coffe"+coffe);
        System.out.println("price"+price);
    }
}
