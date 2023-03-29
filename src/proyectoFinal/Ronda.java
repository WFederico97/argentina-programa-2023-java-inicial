package proyectoFinal;

import java.util.ArrayList;

public class Ronda {
        private int num;
        private ArrayList<Partido> partidos;
        public Ronda(int num){
            this.num = num;
            this.partidos = new ArrayList<>();
        }

    public int getNum() {
        return this.num;
    }
    public void addPartido(Partido partido){
            this.partidos.add(partido);
    }
    public Partido getPartido(int i) {
            return this.partidos.get(i) ;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    public int getSize(){
            return this.partidos.size();
    }
}
