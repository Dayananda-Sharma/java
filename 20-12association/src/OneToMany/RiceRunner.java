package OneToMany;

public class RiceRunner {
    public static void main(String[] args) {
        Rice rice =new Rice("sonamasuri");
        colorRice colorRice=new colorRice(40,rice);
        Riceboth riceboth=new Riceboth(50,rice);
        colorRice.displayRice();
        riceboth.displayBoth();
    }
}
