
public class Producto {
    private String codigo;
    private String nombre; 
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad){
        setCodigo(codigo);
        this.nombre=nombre;
        setCantidad(cantidad);
    }



    //getters y setters
    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;

    }

    public int getCantidad(){
        return cantidad;
    }



    public void setCodigo(String codigo){
        if(codigo !=null && !codigo.isEmpty()){
            this.codigo=codigo;
        }else{
            System.out.println("El codigo esta vacio ");

        }
    }

    public void setCantidad(int cantidad){
        if(cantidad >=0){
            this.cantidad=cantidad;
        }else{
            System.out.println("La cantidad, no puede ser menor a cero, debe de ser mayor");
            
        }
    }




}