package hierarchy_of_collections.list.vector.stack;

import java.util.Stack;

public class Test2 {
}

class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("====================push=========================");
        stack.push("Валентин");
        stack.push("Миша");
        stack.push("Саша");
        stack.push("Коля");
        stack.push("Таня");
        stack.push("Настя");
        System.out.println(stack);
        System.out.println("====================pop()=========================");
        System.out.println("начальный : " + stack);
        while (!stack.isEmpty()) {
            System.out.println("применяем stack.pop() - " + stack.pop());
            System.out.println("обновленный : " + stack);
        }
        stack.push("Валентин");
        stack.push("Миша");
        stack.push("Саша");
        stack.push("Коля");
        stack.push("Таня");
        stack.push("Настя");
        System.out.println("====================peek()=========================");
        System.out.println("с помощью  peek() смотрим самый верхний стек - " + stack.peek());
        System.out.println(stack);
    }
}