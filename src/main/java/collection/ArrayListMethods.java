package collection;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alexandr");
        arrayList1.add("Mariya");
        arrayList1.add(1,"Misha");

        for (String s:arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList <Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        for (String s : arrayList1) {
            System.out.println(s);
        }

        arrayList1.set(1,"Masha");
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);

    }
}
