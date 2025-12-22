package list;

import java.util.ArrayList;
import java.util.List;

public class StudentID {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(101);
        list.add(99);
        list.add(99);
        list.add(109);
        System.out.println(list.toString());
        System.out.println(list.size());
        list.add(122);
        list.add(133);
        System.out.println(list.size());
    }
}
