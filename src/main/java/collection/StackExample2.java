package collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Alexandr");
        stack.push("Oleg");
        stack.push("Anatoliy");
        stack.push("Andrey");
        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
        while(!stack.isEmpty()){
            stack.pop();
//            System.out.println(stack.pop());
            System.out.println(stack);
        }

    }

}
