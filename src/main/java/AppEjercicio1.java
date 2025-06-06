import ejercicio_01_sign.SingValidator;

public class AppEjercicio1 {
    public static void main(String[] args) {
        SingValidator validator = new SingValidator();
        String[] pruebas = {"(", ")", "{", "}", "[" , "]","([]){}","({)}"};

        for (String prueba : pruebas) {
            boolean resultado = validator.isValid(prueba);
            System.out.println("Input: " + prueba + " Output : " + resultado);
        }

    }
}
