package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("horosho");
        list.add("poka");
//        list.forEach(s -> {
//            System.out.print(s);
//            System.out.println("    length = " + s.length());
//        });

//        for (int i = 0; i <list.size() ; i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        System.out.println(list);
        List<Integer> list2 = list.stream()
                .map(l -> l.length())
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(i -> {
            if (i % 3 == 0) {
                i = i / 3;
            }
            return i;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>((o1, o2) -> o1.length()-o2.length());
        set.add("privet");
        set.add("kak dela?");
        set.add("horosho");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}

