package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Kolya");
        arrayList1.add("Mariya");
        arrayList1.add("Alexandr");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
//        list1.add(100);
        System.out.println(list1);


//        Object [] array = arrayList1.toArray();
//        String [] arrayStr = arrayList1.toArray(new String[1]);
//
//        for (Object o:array) {
//            System.out.println(o);
//        }
//        System.out.println();
//        for (String s:arrayStr) {
//            System.out.println(s);
//        }


//        List<String> list = arrayList1.subList(1,5);
//        System.out.println(list);
//        list.add(0,"Fedya");
//        System.out.println(arrayList1);
//        System.out.println(list);
//        arrayList1.add(0,"Lesya");
//        System.out.println(arrayList1);
//        System.out.println(list);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Alexandr");
//        arrayList2.add("Mariya");
//        System.out.println(arrayList2);
////        arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);


    }

}
