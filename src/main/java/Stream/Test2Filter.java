package Stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2Filter {
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
        System.out.println(students);
        System.out.println("----------");

        students.stream().sorted((x,y) ->
                {int result = x.getName().compareTo(y.getName());
                    if(result==0)
                    {result=x.getAge()-y.getAge();}
                    if(result == 0){
                        result=x.getCourse()-y.getCourse();
                    }
                    return result;}
        );
        System.out.println("----------");


        students.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        }).filter(e -> e.getSex() == 'f')
                .sorted(((o1, o2) -> o1.getAge()-o2.getAge()))
                .forEach(e-> System.out.println(e));

        System.out.println("----------");
        System.out.println(students);
        students = students.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
        System.out.println(students);

        students = students.stream()
                .filter(element -> element.getAge() > 22
                        && element.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
        System.out.println(students);
        System.out.println("----------");


        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        myStream.filter(element -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public char getSex() {
        return sex;
    }

    public Student setSex(char sex) {
        this.sex = sex;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public int getCourse() {
        return course;
    }

    public Student setCourse(int course) {
        this.course = course;
        return this;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public Student setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
        return this;
    }
}
