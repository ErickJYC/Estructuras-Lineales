import java.util.Stack;

import static ejericio_02_sorting.StackSorter.sortStack;

public class AppEjercicio2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack antes de ordenar: " + stack);
        sortStack(stack);
        System.out.println("Stack después de ordenar: " + stack);
    }

}

