package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1, "Alexandr Sagayda");
        map1.put(2, "Ivan Ivanov");
        map1.put(3, "Mariya Sidorova");
//        map1.put(4, "Nikolay Petrov");
        map1.put(4, null);
        map1.put(null, "1");
//        map1.put(null, "Nikolay Petrov");
        System.out.println(map1);
        map1.putIfAbsent(4, "Nikolay Petrov");
//        System.out.println(map1.get(1));
        System.out.println(map1);
        map1.remove(4);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(null));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());
        System.out.println(map1);



    }
}
