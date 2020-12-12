package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        String s1 = info1.getValue();
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(2);
        System.out.println(info2);
        Integer s2 = info2.getValue();
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue (){
        return value;
    }

}
