package clase1;

public class clase1 {
    /* public static  void main (String[] args){
        int numero1 = 5;
        int numero2 = 4;
        int resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);
            } */

        /*public static void main (String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;

        /* boolean mostrarPares = true;*/

         /*while (numeroInicio <= numeroFin){
            System.out.println("El valor del numero es: " + numeroInicio);
            numeroInicio++;
        } */

        ////Ejercicio 1b

        /*while(numeroInicio <= numeroFin) {
            if(numeroInicio % 2 == 0 )
                System.out.println(numeroInicio);
            numeroInicio++;
            }*/
            ///Ejercicio 1c

            /* while(numeroInicio <= numeroFin) {
                if (mostrarPares) {
                    if (numeroInicio % 2 == 0){
                        System.out.println(numeroInicio);
                    }
                } else {
                    if (numeroInicio % 2 != 0) {
                        System.out.println(numeroInicio);
                    }
                }
                numeroInicio++;
            } */

            //Ejercicio 1d
           /* for (int i = numeroFin; i >= numeroInicio; i-- ) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

        } */

    ///Ejercicio 2
    public static void main (String[] args){
        float ingresos = 390000;
        int inmuebles = 3;
        int vehiculos = 2;

        if ((ingresos >= 619.720)&& (inmuebles >= 3) && (vehiculos <= 3)) {
            System.out.println("Usted califica para : segmentacion de ingresos altos");
        } else if ((ingresos > 177.063 ) && (inmuebles <= 2) && (vehiculos <= 1)) {
            System.out.println("Usted califica para : segmentacion de ingresos medios");
        } else if ((ingresos <= 177.063) && (inmuebles <= 1) && (vehiculos == 0)) {
            System.out.println("Usted califica para : segmentacion de ingresos bajos");
        }
    }
    }

