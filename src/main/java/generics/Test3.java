package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<Integer>(); // <?> - Wild Card!!! Super type
//        list.add(10);

//        BoundedWildCards
        List<? extends Number> list1 = new ArrayList<Integer>();
//        list1.add(10);

        List <Double> listD = new ArrayList<>();
        listD.add(3.14);
        listD.add(3.12);
        listD.add(3.15);
        showListInfo(listD);
        List <String> listS = new ArrayList<>();
        listS.add("abc");
        listS.add("def");
        listS.add("ghi");
        showListInfo(listS);

        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.14);
        list2.add(3.14);
        System.out.println("summ element in listDouble: "+ listSummElements(list2));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My List conteins next elements: " + list);
    }

    public static double listSummElements(List<? extends Number> list){
        double summ = 0;
        for (Number n:list) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}