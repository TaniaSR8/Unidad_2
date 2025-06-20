
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
          Perro perro1 = new Perro("Casimiro", 3);
        Gato gato1 = new Gato("Mitbol", 2);
         tienda.reabastecer(perro1);
        tienda.reabastecer(gato1);
         Cliente cliente1 = new Cliente("JuanBernardo");
        tienda.venderAnimal(cliente1, perro1); 
        tienda.venderAnimal(cliente1, perro1); 
        tienda.venderAnimal(cliente1, gato1); 
        perro1.ladrar();
        gato1.maullar();
    }
}