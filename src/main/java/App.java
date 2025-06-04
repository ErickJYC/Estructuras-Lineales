import controllers.Cola;
import controllers.Stack;
import controllers.StackG;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);

        stack.printStack();
        stack.pop();
        System.out.println("\n");
        stack.printStack();


        System.out.println("-----------------------COLA-------------------------------");
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);



    }
}
