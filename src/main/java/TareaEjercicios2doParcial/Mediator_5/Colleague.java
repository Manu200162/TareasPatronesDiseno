package TareaEjercicios2doParcial.Mediator_5;

public abstract class Colleague {
    protected ICanal canalDeComunicacion;

    public Colleague(ICanal mediator){
        this.canalDeComunicacion =mediator;
    }

    public abstract void sendPersonal(String message, int Usuario);
    public abstract void sendGrupal(String message);
    public abstract void messageReceived(String message);
}
