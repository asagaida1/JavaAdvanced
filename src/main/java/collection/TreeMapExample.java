package collection;

import collection.Student2;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Student2, Double> treeMap = new TreeMap<>();
        TreeMap<Integer, Student2> treeMap1 = new TreeMap<>();

        Student2 st1 = new Student2("Alexandr", "Sagayda", 3);
//        treeMap1.put(null,st1);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("sergey", "Petrov", 4);
        Student2 st4 = new Student2("Alexandr", "Sagayda", 3);
        Student2 st5 = new Student2("Mariya", "Ivanova", 1);
        Student2 st6 = new Student2("sergey", "Petrov", 4);
        Student2 st7 = new Student2("Alexandr", "Sagayda", 3);
        Student2 st8 = new Student2("Alexandr1", "Sagayda", 3);
        treeMap.put(st1, 5.8);
        treeMap.put(st7, 9.1);
        treeMap.put(st2, 6.4);
        treeMap.put(st4, 7.5);
        treeMap.put(st3, 7.2);
        treeMap.put(st6, 8.2);
        treeMap.put(st5, 7.9);
        treeMap.put(st8, 9.1);
        System.out.println(treeMap);

//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(8.0));
//        System.out.println(treeMap.headMap(6.0));
//        System.out.println();
//        System.out.println(treeMap);
//        treeMap.descendingMap();
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
    }
}
