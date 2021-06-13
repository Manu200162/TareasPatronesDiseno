package TareaEjercicios2doParcial.ExtraSingleton_6;

public class Persona {

    private String name;
    private String ci;
    private  int   montoPrestamo;
    private int    cantidadAPagar;

    public Persona(String name,String ci, int montoPrestamo){
        this.name=name;
        this.ci=ci;
        this.montoPrestamo=montoPrestamo;
        this.cantidadAPagar=0;
    }

    public int getCantidadAPagar() {
        return cantidadAPagar;
    }

    public void setCantidadAPagar(int cantidadAPagar) {
        this.cantidadAPagar = cantidadAPagar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(int montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public void showInfo(){
        System.out.println("Nombre: "+name);
        System.out.println("Ci: "+ci);
        System.out.println("Monto total prestamo: "+montoPrestamo);
        System.out.println("Monto ya pagado: "+cantidadAPagar);
    }

}
