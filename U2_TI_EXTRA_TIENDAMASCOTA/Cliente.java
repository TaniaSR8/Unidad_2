import java.util.ArrayList;

public class Cliente {
    String nombre;
    ArrayList<Animal> mascotas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

    public boolean tieneAnimal(Animal a) {
        return mascotas.contains(a);
    }

    public void agregarMascota(Animal a) {
        mascotas.add(a);
    }
}