package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
public class Test3Suplier {
    public static List<Car> createThreeCars (Supplier<Car> supplier){
        List<Car> list = new ArrayList<>();
       for (int i = 0; i < 3; i++) {
           list.add(supplier.get());
        }
       return list;
    }

    public static void main(String[] args) {
        List<Car> ourCars = createThreeCars(()-> new Car("Dacia Logan", "Black", 1.6));
        System.out.println(ourCars);
    }

}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
