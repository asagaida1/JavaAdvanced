package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveAllPredicate {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Alexandr");
        list.add("Igor");
        list.add("Masha");
        list.add("Anton");
        list.add("Ira");
        System.out.println(list);
//        Predicate<String> p = element -> element.length()<6;
//        list.removeIf(p);
        list.removeIf(e -> e.length()<6);
        System.out.println(list);
    }
}
