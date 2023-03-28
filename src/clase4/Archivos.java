package clase4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public static void main (String[] args){
        String texto = "Este es el texto del archivo";
        File archivo = new File("miArchivo.txt");

        FileWriter escritor = null;
        try {
            escritor= new FileWriter(archivo);
            escritor.write(texto);
            escritor.close();
        } catch (IOException e){
            System.out.println("El archivo  se creo SIN exito");
            throw new RuntimeException(e);
        }
        System.out.println("El archivo se creo con exito");
    }
}
