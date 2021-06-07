package TareaChainOfRespobsability.Ejercicio2;

public class Persona {
    private String nombre;
    private boolean certificadoNacimiento;
    private boolean pagoBancario;
    private boolean ficha;

    public Persona(String nombre,boolean certificadoNacimiento, boolean pagoBancario, boolean ficha) {
        this.nombre=nombre;
        this.certificadoNacimiento = certificadoNacimiento;
        this.pagoBancario = pagoBancario;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(boolean certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public boolean isPagoBancario() {
        return pagoBancario;
    }

    public void setPagoBancario(boolean pagoBancario) {
        this.pagoBancario = pagoBancario;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }

    public void showInfo(){
        System.out.println("Certificado de nacimiento: "+certificadoNacimiento);
        System.out.println("Pago bancario: "+pagoBancario);
        System.out.println("Ficha: "+ficha);
    }
}
