package clase4;
import clase4.Operador;
import java.util.Scanner;

public class clase4 {
    public static void main (String[] args){
        Operador elOperador = new Operador();
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese sus primer numero");
        int num1 = teclado.nextInt();
        System.out.println("ingrese su segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("ingrese la operacion deseada");
        String operacion = teclado.next();
        System.out.println(elOperador.resolver(num1, num2, operacion));
        teclado.close();
    }


}
