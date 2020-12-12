package collection.set_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        set2.add(50);

        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);


        System.out.println(set1);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        set1.addAll(list1);
        System.out.println(set1);
    }
}
