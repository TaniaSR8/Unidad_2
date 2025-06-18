public abstract class Empleado {

    private String id;
    private String nombre;
    private Double salarioBase;

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
