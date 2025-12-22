package ManyToOne;

public class SugarRunner {
    public static void main(String[] args) {
        Tea tea=new Tea(10);
        Coffe coffe=new Coffe(20);
        Sugar sugar=new Sugar(30,tea,coffe);
    }
}
