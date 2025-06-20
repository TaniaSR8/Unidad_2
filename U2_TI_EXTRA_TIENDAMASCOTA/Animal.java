public abstract class Animal{

    String nombre;
    int edad;


    //creo constructor para "inicializar" los valores, atributos

    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }

}