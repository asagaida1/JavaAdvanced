package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alexandr");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);

        ArrayList <String> arrayList = new ArrayList<>(200);
        arrayList.add("Ivan");
        arrayList.add("Alexandr");
        System.out.println(arrayList);
        List<String> list = new ArrayList<>(arrayList);
        System.out.println(list);
        System.out.println(arrayList==list);
        System.out.println(arrayList.equals(list));




    }
}
