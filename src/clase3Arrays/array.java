package clase3Arrays;

public class array {
    public static void main (String[] args){
        ///Ejercicio 1 a

       /* String palabra = "wuthrich";
        char letra = 'h';
        int contador = 0;
        for (int i=0 ; i < palabra.length(); i++){
            if (palabra.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println("La letra " + letra + " Se repite : " + contador + " veces"); */

        ///Ejercicio 1b
        /* int[] numeros = {1,3,5,6,8,11,15,18,22};
        for (int i= numeros.length - 1; i >= 2; i-- ){
            int[] selected = {numeros[i-2], numeros[i - 1], numeros[i]};
            Arrays.sort(selected);
            System.out.println(selected[2] + " " + selected[1] + " " + selected[0]);
        } */
        ///Ejercicio 1c
        /*int[] numeros = {1,3,5,6,8,11,15,18,22};
        int suma = 0;
        for (int i = numeros[3]; i < numeros.length; i ++ ){
            if (numeros[i] != 3){
                suma += numeros[i];
            }
        }
        System.out.println(suma);*/
    }
}
