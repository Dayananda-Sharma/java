package ManytoMany;

public class RBiRunner {
    public static void main(String[] args) {
        Addhar addhar=new Addhar(1136388292);
        UserName userName=new UserName("raju");
        Sbi sbi=new Sbi("hiriyur",addhar,userName);
        Hdfc hdfc=new Hdfc("sira",addhar,userName);
        hdfc.displayHdfc();
        sbi.displaySbi();
    }
}
