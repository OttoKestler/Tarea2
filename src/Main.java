abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void hacerSonido();

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }
}

interface Alimentable {
    void comer();
    void beber();
}

class Perro extends Animal implements Alimentable {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("El perro está bebiendo");
    }

    public void hacerTruco() {
        System.out.println("El perro está haciendo un truco");
    }

    public void hacerTruco(String nombreTruco) {
        System.out.println("El perro está haciendo el truco: " + nombreTruco);
    }
}

class Gato extends Animal implements Alimentable {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("El gato está bebiendo");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais", 3);
        Gato miGato = new Gato("Garfield", 5);

        miPerro.hacerSonido();
        miPerro.comer();
        miPerro.beber();
        miPerro.dormir();
        miPerro.hacerTruco();
        miPerro.hacerTruco("Saltar aros");

        miGato.hacerSonido();
        miGato.comer();
        miGato.beber();
        miGato.dormir();
    }
}
