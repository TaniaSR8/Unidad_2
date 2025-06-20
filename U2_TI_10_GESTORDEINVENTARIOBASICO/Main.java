
public class Main{

    public static void main(String [] args){
        Inventario inventario= new Inventario(3);

        Producto produc1=new Producto("01800", " Paletas", 4);
        Producto produc2=new Producto("20245", "Chicles", 3);
        Producto produc3=new Producto("91111", "Gomitas", 4);
        Producto produc4=new Producto("01458", "Chocolates", 3);

        //agragar

        System.out.println("Estoy agregando el producto 1" + inventario.agregarProducto(produc1));
        System.out.println("Total de los items" + inventario.totalItems());

        System.out.println("Estoy agragando el segundo producto" + inventario.agregarProducto(produc2));
        System.out.println("Total de los items" + inventario.totalItems());

        System.out.println("Estoy agregando el tercer producto"+inventario.agregarProducto(produc3));
        System.out.println("Total de los items" + inventario.totalItems());

        System.out.println("Estoy agregando el cuarto producto"+inventario.agregarProducto(produc4));
        System.out.println("Total de los items" + inventario.totalItems());
        
            //
            Producto encontrado=inventario.buscar("1800");
            if (encontrado != null) {
                System.out.println("Buscar 01800: " + encontrado.getNombre());
            } else {
                System.out.println("Buscar 01800: El producto no fue encontrado");
            }

        Producto nofueEncontrado = inventario.buscar("20245");
        if (nofueEncontrado != null) {
            System.out.println("Buscar 20245: " + nofueEncontrado.getNombre());
        } else {    
            System.out.println("Buscar 20245: El producto no fue encontrado");
        }

        System.out.println("Eliminar 9111 " + inventario.eliminarProducto("9111"));
        System.out.println("Total items " + inventario.totalItems());

        System.out.println("Estoy agragando el cuarto producto , otra vez: " + inventario.agregarProducto(produc4));
        System.out.println("Total items" + inventario.totalItems());

    }
}


