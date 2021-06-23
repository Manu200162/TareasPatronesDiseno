package TareaBridge.ejercicio2;

public class EmpresaSRL extends IEmpresa {
    private IEnvio envio;

    public EmpresaSRL(IEnvio envio){
        this.envio=envio;
        this.nombreEmpresa="Empresa SRL";
        this.tiempoDeServicio="6 años de servicio";
    }

    @Override
    public void enviar(Paquete paquete) {
        System.out.println("La "+nombreEmpresa+" enviara el paquete");
        envio.enviar(paquete);
    }
}
