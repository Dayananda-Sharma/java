package set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeID {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(11);
        set.add(11);
        set.add(9);
        set.add(7);
        System.out.println(set.size());
        System.out.println(set.toString());
        set.forEach(n-> System.out.println(n));
        set.clear();
        set.add(11);
        set.add(9);
        set.add(22);
        System.out.println(set.toString());
        System.out.println(set.size());
    }
}
