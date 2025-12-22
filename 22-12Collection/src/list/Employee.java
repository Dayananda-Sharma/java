package list;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Raju");
        list.add("dasa");
        list.add("dosraj");
        System.out.println(list.toString());
        list.forEach(n-> System.out.println(n));
        System.out.println(list.size());
        list.clear();
        list.add("dinga");
        list.add("bossa");
        System.out.println(list.size());
    }
}
