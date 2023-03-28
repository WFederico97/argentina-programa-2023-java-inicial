package clase7;

public class Perro extends Animal implements ParaPerro{


    Perro(String nombre, int edad){
        super(nombre,edad);

    }

    @Override
    public void ladrar() {
        System.out.println("Guau");
    }
}
