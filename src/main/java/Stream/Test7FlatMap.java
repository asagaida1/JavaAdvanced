package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test7FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan1", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathmatics");

        f1.addStudentOfFaculty(st1);
        f1.addStudentOfFaculty(st2);
        f1.addStudentOfFaculty(st3);
        f2.addStudentOfFaculty(st4);
        f2.addStudentOfFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentOfFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));
    }

}

class Faculty {
    String name;
    List<Student> studentOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOfFaculty = new ArrayList<>();
    }

    public List<Student> getStudentOfFaculty() {
        return studentOfFaculty;
    }

    public void addStudentOfFaculty(Student student) {
        studentOfFaculty.add(student);

    }
}
