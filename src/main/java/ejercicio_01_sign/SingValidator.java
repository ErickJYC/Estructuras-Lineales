package ejercicio_01_sign;

import controllers.Stack;
import controllers.StackG;

public class SingValidator {
    public boolean isValid(String cadena){
        StackG <Character> pila = new StackG<>();

        for (int i = 0; i < cadena.length();i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            }else if (caracter == ')' || caracter == ']' || caracter == '}') {
                if (pila.isEmpty()){
                    return false;
                }
                char tope = pila.pop();

                if ((caracter == ')' && tope != '(' ) ||
                (caracter == ']' && tope != '[') ||
                        (caracter == '}' && tope != '{')) {
                    return false;
                }
                }else {
                    return false;
                }

            }

        return pila.isEmpty();
        }

    }

