package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
    Function<Student, Double> f = student -> student.avgGrade;

    static double avgOfSmth(List<Student> lst, Function<Student, Double> f) {
        double result = 0;
        for (Student st : lst) {
            result += f.apply(st);
        }
        return result/lst.size();
    }

}

class FunctionInterfaceTest {
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
        FunctionInterface functionInterface = new FunctionInterface();

        double resultAvgGrade = FunctionInterface.avgOfSmth(students, student -> student.avgGrade);
        double resultAvgAge = FunctionInterface.avgOfSmth(students, student -> (double)student.age);
        double resultAvgCourse = FunctionInterface.avgOfSmth(students, student -> (double) student.course);
        System.out.println("resultAvgGrade = " + resultAvgGrade);
        System.out.println("resultAvgAge = " + resultAvgAge);
        System.out.println("resultAvgCourse = " + resultAvgCourse);
    }
}
