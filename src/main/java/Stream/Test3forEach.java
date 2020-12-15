package Stream;

import java.util.Arrays;

public class Test3forEach {
    public static void main(String[] args) {
        int [] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(i->{i*=2;
            System.out.println(i);});
        System.out.println("-----------------");
        Arrays.stream(array).forEach(i->System.out.println(i));
        System.out.println("-----------------");
        Arrays.stream(array).forEach(System.out::println); //MethodRefferens.
        System.out.println("-----------------");
        Arrays.stream(array).forEach(Utils::myMethod); //MethodRefferens.
    }
}
class Utils{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("Element = "+ a);
    }
}
