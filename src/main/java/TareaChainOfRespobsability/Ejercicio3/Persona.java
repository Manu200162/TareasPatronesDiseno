package TareaChainOfRespobsability.Ejercicio3;

public class Persona {
    private String nombre;
    private String ci;
    private int    edad;

    public Persona(String nombre, String ci, int edad) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void showPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Ci: "+ci);
        System.out.println("Edad: "+edad);
    }
}
