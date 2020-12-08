package generics;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("ok");
//        list.add(5);
//        list.add(new StringBuilder("Qwerty"));
//        list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("qwerty");


        for (Object s: list) {
            System.out.println(s + " dlinna " + ((String)s).length());
        }
    }
}

class Car {

}
