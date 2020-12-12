package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExamplePolindrom {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new ArrayList<>();
        for (char c: s.toCharArray()) {
            list.add(c);
        }
        System.out.println(list);
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reversListIterator = list.listIterator(list.size());
        boolean isPolindrom = true;
        while (listIterator.hasNext()&&reversListIterator.hasPrevious()){
            if(listIterator.next()!=reversListIterator.previous()){
                isPolindrom=false;
                break;
            }
        }
        if(isPolindrom){
            System.out.println("polindrom");
        }
        else{
            System.out.println("not polindrom");
        }
    }
}
