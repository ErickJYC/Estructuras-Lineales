import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("tam = " + stack.size());
        stack.printStack();
        stack.pop();
        //stack.peek();
        System.out.println("tam = " + stack.size());
        stack.printStack();

        StackG<String> stackGS = new StackG<String>();
        stackGS.push("uno");
        stackGS.push("cuatro");
        System.out.println("tam = "+ stackGS.size());
        stackGS.printStack();

        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.printCola();
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiende a la persona ->" + colaPersonas.remove());
        System.out.println(colaPersonas.size());;
        System.out.println("tam = "+ colaPersonas.size());
    }
}
