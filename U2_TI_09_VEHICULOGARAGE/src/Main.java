public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);
        
    // Duda, del relleno, 
        Vehiculo coche1 = new Coche("202546HJ04", "Toyota", 4);
        Vehiculo moto1 = new Motocicleta("20253DS011", "Yamahha", true);
        Vehiculo coche2 = new Coche("20259DH08", "Honda", 2);
        garage.estacionar(coche1);
        garage.estacionar(moto1);
        garage.estacionar(coche2);
        System.out.println("Vehículos en el garage: " + garage.contarVehiculos());
        garage.retirar("20254SDS05");
        System.out.println("Vehículos en el garage después de retirar: " + garage.contarVehiculos());
    }
}