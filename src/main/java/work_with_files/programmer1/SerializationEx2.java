package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mariya", "IT", 28, 500, new Car("Toyota","black"));
        Employee employee2 = new Employee("Sveta", "IT", 28, 500, new Car("Toyota","black"));
        Employee employee3 = new Employee("Lena", "IT", 28, 500, new Car("Toyota","black"));
        Employee employee4 = new Employee("Olya", "IT", 28, 500, new Car("Toyota","black"));
        Employee employee5 = new Employee("Sergey", "IT", 28, 500, new Car("Toyota","black"));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))){


outputStream.writeObject(employee1);
            System.out.println("Done");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
