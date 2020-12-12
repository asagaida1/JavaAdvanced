package lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.printStudentOverGrade(students, 8);
    }

    void printStudentOverGrade(List<Student> list, double grade) {
        for (Student s : list) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentAnderGrade(List<Student> list, int age) {
        for (Student s : list) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(List<Student> list, int age, double grade, char sex) {
        for (Student s : list) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
