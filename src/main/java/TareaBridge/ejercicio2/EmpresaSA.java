package TareaBridge.ejercicio2;

public class EmpresaSA extends IEmpresa {
    private IEnvio envio;

    public EmpresaSA(IEnvio envio){
        this.envio=envio;
        this.nombreEmpresa="Empresa SA";
        this.tiempoDeServicio="20 años de servicio";
    }

    @Override
    public void enviar(Paquete paquete) {
        System.out.println("La "+nombreEmpresa+" enviara el paquete");
        envio.enviar(paquete);
    }
}
