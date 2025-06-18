public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);
    // Duda, del relleno, 
        Vehiculo coche1 = new Coche("AJK255", "Toyota", 4);
        Vehiculo moto1 = new Motocicleta("XYZ789", "Yamahha", true);
        Vehiculo coche2 = new Coche("DEF456", "Honda", 2);

        garage.estacionar(coche1);
        garage.estacionar(moto1);
        garage.estacionar(coche2);

        System.out.println("Vehículos en el garage: " + garage.contarVehiculos());

        garage.retirar("XYZ789");

        System.out.println("Vehículos en el garage después de retirar: " + garage.contarVehiculos());
    }
}