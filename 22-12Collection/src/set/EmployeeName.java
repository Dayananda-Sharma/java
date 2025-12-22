package set;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeName {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("dara");
        set.add("dara");
        set.add("raja");
        set.add("ammu");
        System.out.println(set.toString());
        System.out.println(set.size());
        set.add("raki");
        set.add("ramu");
        System.out.println(set.size());
    }
}
