package OneToMany;

public class SaltRunner {
    public static void main(String[] args) {
        Salt salt=new Salt(100);
        Upittu upittu=new Upittu(100,salt);
        TamotoBath tamotoBath=new TamotoBath(100,salt);
        tamotoBath.displayTamoto();
        upittu.displayUpittu();
    }
}
