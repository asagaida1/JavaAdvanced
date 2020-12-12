package collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student2> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student2 st1 = new Student2("Alexandr", "Sagayda", 3);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("sergey", "Petrov", 4);
        Student2 st4 = new Student2("Alexandr", "Sagayda", 3);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
        System.out.println(lhm);
        System.out.println(lhm.get(7.5));
        System.out.println(lhm.get(7.2));
        System.out.println(lhm.get(6.4));
        System.out.println(lhm.get(5.8));
        System.out.println(lhm);
    }
}