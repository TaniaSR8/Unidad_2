//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado emple1 = new EmpleadoTiempoCompleto("0125", "Jonathan", 6000.0, "Seguro Medico");
        Empleado emple2 = new EmpleadoPorHoras("0128", "Kariana", 8000.0, 25);
        System.out.println("El salario de la persona"+emple1.getNombre()+ "El salario es de:" + emple1.calcularSalario());
        System.out.println("El salario de la persona:"+emple2.getNombre()+"El salario es de:" + emple2.calcularSalario());
    }

}