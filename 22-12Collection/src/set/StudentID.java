package set;

import java.util.Set;
import java.util.TreeSet;

public class StudentID {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>();
        set.add(11);
        set.add(12);
        set.add(12);
        set.add(9);
        System.out.println(set.size());
        System.out.println(set.toString());
        set.clear();;
        set.add(11);
        set.add(66);
        System.out.println(set.size());
    }
}
