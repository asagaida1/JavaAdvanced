package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9LimitSkipMinMaxBoxed {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        Student s = students.stream().min((o1, o2)->o1.getAge()-o2.getAge()).get();
        System.out.println(s);
        List <Student> list2 = students.stream().filter(e->e.getAge()>20).skip(3).limit(3).collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> list3 = students.stream().mapToInt(e->e.getCourse()).boxed().collect(Collectors.toList());

        double avg = students.stream().mapToDouble(e->e.getAvgGrade()).average().getAsDouble();
        System.out.println(avg);

        int min = students.stream().mapToInt(e->e.getAge()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(e->e.getCourse()).max().getAsInt();
        System.out.println(max);



    }
}
