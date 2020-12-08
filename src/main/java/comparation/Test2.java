package comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6543);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String Surname;
    private Integer salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.Surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.id== o.id){
//            return 0;
//        }
//        else if (this.id < o.id){
//            return -1;
//        }
//        else{
//            return 1;
//        return this.id-o.id;
        int result = this.name.compareTo(o.name);
        if (result==0){
            result = this.Surname.compareTo(o.Surname);
        }
        if (result==0){
            result = this.salary.compareTo(o.salary);
        }

        return result;
    }
}

