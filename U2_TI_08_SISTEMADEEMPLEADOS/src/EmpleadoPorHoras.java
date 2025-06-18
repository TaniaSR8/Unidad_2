public class EmpleadoPorHoras extends Empleado {

    //hacer lo de los atributos private int horasTrabajadas y lo del constructor

    private int horasTrabajadas;

    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int horasTrabajadas) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()*horasTrabajadas;
    }
}
