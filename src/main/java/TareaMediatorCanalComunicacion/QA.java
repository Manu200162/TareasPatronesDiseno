package TareaMediatorCanalComunicacion;

public class QA extends Colleague{
    private String nombre;
    private String ci;
    private String grado;

    public QA(ICanalComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received QA "+grado+","+nombre+">"+message);
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
