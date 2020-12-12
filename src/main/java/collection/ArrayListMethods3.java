package collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alexandr");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        System.out.println(arrayList2);

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList1.addAll(1,arrayList2);
        System.out.println(arrayList1);
//        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList1.indexOf("Alexandr"));
        System.out.println(arrayList1.indexOf("???"));
        System.out.println(arrayList1.lastIndexOf("???"));
        System.out.println("arrayList1.size() " + arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        System.out.println(!arrayList1.isEmpty());
        System.out.println(arrayList1.contains("!!!"));
        arrayList1.remove(1);
        arrayList1.remove(4);
        System.out.println(arrayList1);
        System.out.println(arrayList1.containsAll(arrayList2));


    }
}
