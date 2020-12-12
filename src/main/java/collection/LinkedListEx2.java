package collection;

import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        Studen2 st1 = new Studen2("Ivan", 3);
        Studen2 st2 = new Studen2("Nikolay", 2);
        Studen2 st3 = new Studen2("Elena", 1);
        Studen2 st4 = new Studen2("Petr", 4);
        Studen2 st5 = new Studen2("Mariya", 3);
        LinkedList<Studen2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LikedList = " + student2LinkedList);
        System.out.println(student2LinkedList.get(2));
        Studen2 st6 = new Studen2("Ira", 1);
        Studen2 st7 = new Studen2("Sveta", 1);
        student2LinkedList.add(1,st6);
        student2LinkedList.add(0,st7);
        System.out.println(student2LinkedList);
        student2LinkedList.remove(3);
        System.out.println(student2LinkedList);


    }
}
class Studen2{
    private String name;
    private int age;

    public Studen2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studen2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
