package proyectoFinal;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class mainProyecto {
    public static void main(String[] args) throws IOException{
        Path resultados = Paths.get("src/proyectoFinal/resultados.csv");
        long l = Files.lines(resultados).count();
        int dimension = (int) 1;
        Ronda ronda = new Ronda(dimension);
        int index = 0;
        for (String linea : Files.readAllLines(resultados, StandardCharsets.UTF_8)){
            String[] i = linea.split(",");
            Equipo equipo1 = new Equipo(i[0]);
            Equipo equipo2 = new Equipo(i[3]);
            Partido partido = new Partido(equipo1,
                    equipo2,
                    Integer.parseInt(i[1]),
                    Integer.parseInt(i[2]));
            ronda.setPartido(index,partido);
            index++;
        }
        Path pronosticos = Paths.get("src/proyectoFinal/partidos.csv");
        int partido = 0;
        int puntos  = 0;
        String persona = "Jhonn Doe";
        for (String linea : Files.readAllLines(pronosticos, StandardCharsets.UTF_8)){
            Pronostico pronostico = new Pronostico();
            pronostico.setPartido(ronda.getPartido(partido));
            String[] i = linea.split(",");
            String nombre;
            if (i[1].equals("x")){
                nombre=i[0];
                pronostico.setResultado(ResultadoEnum.ganador);
            } else if (i[2].equals("x")) {
                nombre = i[3];
                pronostico.setResultado(ResultadoEnum.ganador);

            } else {
                nombre = "ninguno";
                pronostico.setResultado(ResultadoEnum.empate);
            }
            Equipo equipo = new Equipo(nombre);
            pronostico.setEquipo(equipo);
            if (pronostico.Puntos()){
                puntos++;
            }
            partido++;
        }
        System.out.println(persona + " obtuvo " + puntos + " puntos ");
    }
}
