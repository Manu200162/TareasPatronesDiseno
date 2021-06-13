package TareaEjercicios2doParcial.Mediator_5;

public class Usuario extends Colleague {
    private String nombre;
    private String celularNumber;

    public Usuario(ICanal mediator) {
        super(mediator);
    }

    @Override
    public void sendPersonal(String message, int Usuario) {
        canalDeComunicacion.sendPersonal(message,this,Usuario);
    }

    @Override
    public void sendGrupal(String message) {
        canalDeComunicacion.sendGrupal(message,this);
    }


    @Override
    public void messageReceived(String message) {
        System.out.println("INFO -El usuario con nombre: "+nombre+" y numero de celular:  "+celularNumber);
        System.out.println("recibio el mensaje: "+message);
        System.out.println("**************************************************");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelularNumber() {
        return celularNumber;
    }

    public void setCelularNumber(String celularNumber) {
        this.celularNumber = celularNumber;
    }
}
