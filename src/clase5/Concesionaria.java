package clase5;

import java.time.LocalTime;

public class Concesionaria {
    public static void main (String[] args){

        Auto auto1 = new Auto( 5,"rojo", "Ford","Ecosport");
        System.out.println(" " + auto1.toString());
        auto1.setColor("azul");


        Usado auto2 = new Usado(4,"verde", "Renault", "Twingo", 120000);
        System.out.println(auto2.toString());

        Auto auto3 = new Auto(5,"Negro","Nissan","Tiida");
        System.out.println(auto3.toString());
    }
}
class Auto {
    static String nombre = "auto";
    private int puertas ;
    private String color;
    private String marca;
    private String modelo;
    private boolean usado;
    public Auto(int puertas, String color, String marca, String modelo){
        this.usado = false;
        this.modelo = modelo;
        this.color = color;
        this.puertas= puertas;
        this.marca = marca;

    }


    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isUsado() {
        return usado;
    }

    @Override
    public String toString() {
        return "Auto: " + marca + " " + modelo + '\n' +
                " puertas:" + puertas +  '\n' +
                " color:" + color + '\n' +
                " usado:" + usado + "\n";
    }
}

class Usado extends Auto {
    int kilometraje;
    public Usado(int puertas, String color, String marca, String modelo, int kilometraje){
        super(puertas, color, marca, modelo); ///La clase super , sobreescribe a otra clase tomando protagonismo a esta
        super.setUsado(true);
        this.kilometraje = kilometraje;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "Auto: " + super.getMarca() + " " + super.getModelo() + '\n' +
                " puertas:" + super.getPuertas() +  '\n' +
                " color:" + super.getColor() + '\n' +
                " Kilometraje:" +this.getKilometraje()+ " Kms " + "\n";
    }
}

