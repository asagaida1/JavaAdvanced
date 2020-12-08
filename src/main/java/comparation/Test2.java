package comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur123", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6543);
        Employee emp3 = new Employee(12, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);
//        Collections.sort(list, new Employee.NameCountComparator().thenComparing(new Employee.IdComparator()));
        System.out.println("After first sorting \n" + list);
        list.sort(new Employee.IdComparator());
        System.out.println("After second sorting \n" + list);
    }
}

class Employee
//    implements Comparable<Employee>
{
    private int id;
    private String name;
    private String Surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.Surname = surname;
        this.salary = salary;
    }

    static class IdComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.id - o2.id;
        }
    }

    static class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);

        }
    }

    static class NameCountComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.length() - o2.name.length();

        }
    }

    static class SurnameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.Surname.compareTo(o2.Surname);
        }
    }

    static class SalaryMinComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary;
        }
    }

    static class SalaryMaxComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.salary - o1.salary;
        }
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

//    @Override
//    public int compareTo(Employee o) {
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id < o.id) {
//            return -1;
//        } else {
//            return 1;
//        }
////        return this.id-o.id;
////        int result = this.name.compareTo(o.name);
////        if (result==0){
////            result = this.Surname.compareTo(o.Surname);
////        }
////        if (result==0){
////            result = this.salary.compareTo(o.salary);
////        }
////
////        return result;
}



