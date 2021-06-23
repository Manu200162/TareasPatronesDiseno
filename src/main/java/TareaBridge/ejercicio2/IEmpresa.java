package TareaBridge.ejercicio2;

public abstract class IEmpresa {

    protected String nombreEmpresa;
    protected String tiempoDeServicio;

    public void showInfoEmpresa(){
        System.out.println("Nombre de la empresa: "+nombreEmpresa);
        System.out.println("Tiempo en servicio de la empresa: "+tiempoDeServicio);
    }
    public abstract void enviar(Paquete paquete);

}
