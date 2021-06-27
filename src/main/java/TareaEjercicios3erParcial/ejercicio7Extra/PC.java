package TareaEjercicios3erParcial.ejercicio7Extra;

public class PC implements IComputadora{
    private String tipo;
    private int antiguedad;
    private String cpu;
    private int tamanio;

    public PC(String tipo, int antiguedad, String cpu, int tamanio) {
        this.tipo = tipo;
        this.antiguedad = antiguedad;
        this.cpu = cpu;
        this.tamanio=tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    @Override
    public int getTamanio(){
        return this.tamanio;
    }

    @Override
    public void showInfoComputadora() {
        System.out.println("Informacion PC");
        System.out.println("Tipo: "+tipo);
        System.out.println("Años de uso: "+antiguedad+" años");
        System.out.println("Cpu: "+cpu);
        System.out.println("Tamanio: "+tamanio+" cm");
        System.out.println("---------------------------------");
    }

    @Override
    public void recibirReparacion(IModoReparacion reparacion) {
        reparacion.recibirReparacion(this);
    }

}
