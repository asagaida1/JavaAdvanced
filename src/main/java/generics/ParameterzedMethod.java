package generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterzedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("def");
        list1.add("ghi");

        String s = GenMethod.getSecondElement(list1);
        System.out.println(s);
    }

}
class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
