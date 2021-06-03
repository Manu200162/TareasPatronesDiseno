package TareaMediatorCanalComunicacion;

public class DEV extends Colleague{
    private String nombre;
    private String ci;
    private String lenguaje;

    public DEV(ICanalComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received DEV ,"+nombre+">"+message);
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

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
