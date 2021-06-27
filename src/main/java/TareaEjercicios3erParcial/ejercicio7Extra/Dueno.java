package TareaEjercicios3erParcial.ejercicio7Extra;

public class Dueno implements IDueno{
    private String nombre;
    private String puesto;

    public Dueno(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public void notificar(String message) {
        System.out.println("El "+puesto+" recibe el siguiente mensaje: ");
        System.out.println(message);
    }

    @Override
    public String getpuesto() {
        return puesto;
    }
}
