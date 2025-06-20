

public class Inventario{

    private Producto[] stock;

    public Inventario(int tamaño){

        stock=new Producto[tamaño];

    }

    public boolean agregarProducto(Producto produc){

        for(int i=0; i < stock.length; i++){
            if(stock[i]==null){
                stock[i]=produc;
                return true;
            }
            }return false;
        }

        public boolean eliminarProducto(String codigo){
            for(int i=0; i < stock.length; i++){
                if(stock [i] !=null && stock[i].getCodigo().equals (codigo)){
                    stock[i]= null;
                    return true;
                }
            }
            return false;

        }

        public Producto buscar(String codigo){
            for(Producto produc: stock){
                if(produc!=null && produc.getCodigo().equals(codigo)){
                    return produc;

                }
            }
            return null;
        }

        public int totalItems (){
            int total = 0;
            for(Producto produc:stock){
                if(produc!=null){
                    total+=produc.getCantidad();

                }
            }
            return total;
        }




    }



