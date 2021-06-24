package TareaCompositeComputadora;

public abstract class Component {

    private String nombre;
    private int precio;

    public Component(String nombre){
        this.nombre=nombre;
        this.precio=100;
    }

    public void showInfo(){
        System.out.println("\nNombre del dispositivo: "+nombre);
        System.out.println("Precio: "+precio+"\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract int operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void getChild(int position);
}
