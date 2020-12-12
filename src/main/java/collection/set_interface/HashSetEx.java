package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alexandr");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add("Igor");
        for (String s: set) {
            System.out.println(s);
        }

        System.out.println(set);
        set.remove("Al");
        System.out.println(set);
        set.remove("Alexandr");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));
        System.out.println(set.contains("Marina"));

    }
}
