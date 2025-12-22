package list;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Dara");
        list.add("manasa");
        list.add("Ranjitha");
        System.out.println(list.toString());
        System.out.println(list.size());
        list.forEach(n-> System.out.println(n));
        list.add("manoja");
        list.add("babu");
        System.out.println(list.size());
    }
}
