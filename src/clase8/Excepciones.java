package clase8;

import java.util.Scanner;

public class Excepciones {
    public static void main (String[] args){
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escriba primer numero");
            int nro1 = entrada.nextInt();
            System.out.println("Escriba el segundo nro");
            int nro2 = entrada.nextInt();
            int resultado = nro1/nro2;
            System.out.println("El resultado es : " + resultado );
        } catch (Exception e){
            System.out.println("Error: no se puede dividir por 0 (cero) ");
        }
    }

}
