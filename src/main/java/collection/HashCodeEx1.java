package collection;

import java.util.*;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map <Student2, Double> map = new HashMap<>();
        Student2 st1 = new Student2("Alexandr", "Sagayda", 3);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("sergey", "Petrov", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);
        Student2 st4 = new Student2("Alexandr", "Sagayda", 3);
        boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st4.equals(st1));
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

    }
}

class Student2 implements Comparable<Student2>{
    String name;
    String surname;
    int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course &&
                Objects.equals(name, student2.name) &&
                Objects.equals(surname, student2.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }
}