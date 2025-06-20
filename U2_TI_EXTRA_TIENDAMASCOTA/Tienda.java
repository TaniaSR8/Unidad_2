

import java.util.ArrayList;

public class Tienda {
    ArrayList<Animal> inventario;
    public Tienda() {
        this.inventario = new ArrayList<>(); }
    public boolean venderAnimal(Cliente c, Animal a) {
        if (inventario.contains(a) && !c.tieneAnimal(a)) {
            inventario.remove(a);
            c.agregarMascota(a);
            System.out.println("La venta de este animal fue realizada con exito " + a.getNombre() );
            return true;
        } else {System.out.println("No se pudo vender el animal");
            return false;
        }
    }
    public void reabastecer(Animal a) {
        inventario.add(a);
        System.out.println(a.getNombre() + " , este animal fue agregado al inventario.");
    }
}