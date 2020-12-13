package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(List<Student> list, Predicate predicate) {
        for (Student s:list) {
            if(predicate.test(s)){
                System.out.println(s);
            }
        }
    }


//    void printStudentOverGrade(List<Student> list, double grade) {
//        for (Student s : list) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(List<Student> list, int age) {
//        for (Student s : list) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(List<Student> list, int age, double grade, char sex) {
//        for (Student s : list) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
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
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("-----------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
//        info.testStudents(students, (Student s) -> s.avgGrade > 8);

        System.out.println("-----------------");
//        info.testStudents(students, sc -> sc.age >= 30);

        System.out.println("-----------------");
//        info.testStudents(students, (Student s)-> s.avgGrade>5&&s.age>20&&s.sex=='f');
//        s.age > age && s.avgGrade < grade && s.sex == sex

        System.out.println("-----------------");
        Predicate<Student> p1 = student -> student.age>20;
        Predicate<Student> p2 = student -> student.avgGrade>9;
        Predicate<Student> p3 = student -> student.sex=='f';

        info.testStudents(students, p1.and(p2).or(p3));


//        info.printStudentOverGrade(students, 8);
//        System.out.println("-----------------");
//        info.printStudentUnderAge(students, 30);
//        System.out.println("-----------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}
