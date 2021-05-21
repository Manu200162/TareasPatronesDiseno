package TareaFactoryMethodAerolinea;

public class Pasajero {
    //pasajero (nombre,ci,fechaNacimiento)

    private int    ci;
    private String nombre;
    private String fechaNacimiento;

    public Pasajero (){}

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void showInfo(){
        System.out.println("pasajero ci: "+ci);
        System.out.println("pasajero nombre: "+nombre);
        System.out.println("pasajero fecha de nacimiento: "+fechaNacimiento);

    }
}
