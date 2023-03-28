package clase4;

public class Operador {
    public static String resolver (int num1, int num2, String operacion){
        if (operacion.equals("sumar")){
            return "Suma: " +   (num1+num2);
        }else if (operacion.equals("restar")){
            return "Resta: " + (num1 - num2);
        } else if (operacion.equals("dividir")) {
            return "Division:" + (num1 / num2);
        } else if (operacion.equals("multiplicar")) {
            return "Producto: " + (num1 * num2);
        } else {
            return "ERROR";
        }
    }
}
