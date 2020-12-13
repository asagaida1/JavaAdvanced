package lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ForEachConsumer {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "Kak dela?", "Normalno", "Poka");
//        for (String s: list) {
//            System.out.println(s);
//        }
//        list.forEach(s -> System.out.println(s));
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el-> {
            System.out.println(el);
            el*=2;
            System.out.println(el);
        });
        list2.forEach(q-> System.out.println(q));

    }
}
