package TareaMediatorCanalComunicacion;

public class SM extends Colleague{
    private String nombre;
    private String ci;
    private String certificaciones;

    public SM(ICanalComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalComunicacion.send(message,this);

    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received SM ,"+nombre+">"+message);
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

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }
}
