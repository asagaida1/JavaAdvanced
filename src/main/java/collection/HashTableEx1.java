package collection;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double, Student2> ht = new Hashtable<>();
//        LinkedHashMap<Double, Student2> ht = new LinkedHashMap<>(16, 0.75f, true);
        Student2 st1 = new Student2("Alexandr", "Sagayda", 3);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("sergey", "Petrov", 4);
        Student2 st4 = new Student2("Alexandr", "Sagayda", 3);
        ht.put(5.8, st1);
        ht.put(6.4, st2);
        ht.put(7.2, st3);
        ht.put(7.5, st4);
        System.out.println(ht);
        System.out.println(ht.get(7.5));
        System.out.println(ht.get(7.2));
        System.out.println(ht.get(6.4));
        System.out.println(ht.get(5.8));
        System.out.println(ht);
    }
}
