package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Kolya");
        arrayList1.add("Mariya");
        arrayList1.add("Alexandr");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
