package ManyToOne;

public class PhoneRunner {
    public static void main(String[] args) {
        Sim sim=new Sim(300);
        Android android=new Android("vivo",sim);
        Iphone iphone=new Iphone("16pro",sim);

      iphone.displayIphone();
      android.displayAndroid();
    }
}
