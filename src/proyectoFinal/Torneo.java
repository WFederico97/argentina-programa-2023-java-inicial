package proyectoFinal;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class Torneo {
    public static void main(String[] args) throws IOException{
        Fase fase = new Fase();
        RegistrarPartidos(fase);
        Participantes participantes = new Participantes();
        GenerarPronosticos(fase,participantes);
        TablaPosiciones(participantes);
    }
    private static void RegistrarPartidos(Fase fase) throws IOException{
        System.out.println("----PROCESANDO RONDAS----");
        String file = "src/proyectoFinal/resultados.csv";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        Ronda ronda = new Ronda(1);

        while (scanner.hasNext()){

            String line = scanner.nextLine();
            String[] cell = line.split(",");
            String numeroRonda = cell[0];
            String local = cell[1];
            String golesLocal = cell[2];
            String golesVisita = cell[3];
            String visitante = cell[4];


            if (numeroRonda.equals(String.valueOf(ronda.getNum()))){


                Equipo equipoLocal = new Equipo (local);
                Equipo equipoVisitante = new Equipo(visitante);

                Partido partido = new Partido(equipoLocal,equipoVisitante,
                        Integer.parseInt(golesLocal),Integer.parseInt(golesVisita));

                ronda.addPartido(partido);

            } else {
                System.out.println(ronda.getNum() + " " + ronda.getPartidos());
                fase.addRonda(ronda);

                ronda = new Ronda(Integer.parseInt(numeroRonda));
                Equipo equipoLocal = new Equipo(cell[1]);
                Equipo equipoVisitante = new Equipo(cell[4]);
                Partido partido = new Partido(equipoLocal, equipoVisitante,
                        Integer.parseInt(cell[2]), Integer.parseInt(cell[3]));

                ronda.addPartido(partido);
            }

        }
        if (!scanner.hasNext()){
            fase.addRonda(ronda);
        }
    }
    private static void GenerarPronosticos (Fase fase, Participantes participantes) throws IOException {
        String file = "src/proyectoFinal/partidos.csv";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        String lastName = "";
        int numPersona = -1;
        int numPartido = 0;
        int numRonda = 0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] data = line.split(",");
            String nombre = data[0];
            if (!nombre.equals(lastName)){
                System.out.println("----Generando pronosticos de " + nombre + " ----");
                Persona persona = new Persona(nombre);
                Participantes.addPersona(persona);
                lastName = nombre;
                numPersona++;
                numPartido = 0;
                numRonda = 0;
            }
            Pronostico pronostico = new Pronostico();

            if ( numPartido == fase.getRonda(numRonda).getSize()){
                numRonda++;
                numPartido = 0;
            }

            Partido partido = fase.getRonda(numRonda).getPartido(numPartido);

            pronostico.setPartido(partido);
            pronostico.setEquipo(Apuesta(partido,data));
            pronostico.setResultado(Res(data));

            System.out.println(pronostico);

            if (pronostico.Acertado()){
                participantes.getPersona(numPersona).SumaPunto();
            }



            participantes.getPersona(numPersona).addPronostico(pronostico);
            numPartido++;
        }
        scanner.close();
    }
    private  static  Equipo Apuesta(Partido partido, String[] data){
        if (data[2].equals("x")){
            return partido.getLocal();
        } else if (data[3].equals("x")) {
            return partido.getVisit();
        }
        return null;
    }
    private static ResultadoEnum Res(String[] data){
        if (data[2].equals("x") || data[3].equals("x") ) {
            return ResultadoEnum.ganador;
        }
        return ResultadoEnum.empate;
    }
    private static  void TablaPosiciones(Participantes participantes){
        System.out.println("///TABLA DE POSICIONES///");

        List<Persona> personas = participantes.getPersonas();

        ///Hago un sorting del array de participantes para ordenarlo de manera decreciente
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getPuntos() - p1.getPuntos(); // descending order
            }
        });
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            System.out.println("(" + (i + 1) + ") " + persona.getNombre() + " [" + persona.getPuntos() + "]");
        }



    }
}

