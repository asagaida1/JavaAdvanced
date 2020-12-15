package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4Reduce {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(8);
        integers.add(2);
        integers.add(4);
        integers.add(3);


        int result = integers.stream()
                .reduce((i, i2) -> i * i2)
                .get();
        System.out.println(result);
        System.out.println("-----------");
        List<Integer> list100 = new ArrayList<>();

//        int result100 = list100.stream()
//                .reduce((i, i2) -> i * i2)
//                .get();
//        System.out.println(result100);
        Optional<Integer> o = list100.stream()
                .reduce((accomulator, element) -> accomulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("No value present");
        }

        Optional<Integer> o1 = integers.stream()
                .reduce((accomulator, element) -> accomulator * element);
        if (o1.isPresent()) {
            System.out.println(o1.get());
        } else {
            System.out.println("No value present");
        }
        System.out.println("-------------");

        int result2 = integers.stream()
                .reduce(1,(i, i2) -> i * i2);
        System.out.println(result2);
        System.out.println("-------------");

        List <String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("horosho");
        list3.add("poka");

        String result3 = list3.stream().reduce((a,e)-> a + " " + e).get();
        System.out.println(result3);

    }
}
