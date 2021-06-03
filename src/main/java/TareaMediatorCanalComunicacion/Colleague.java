package TareaMediatorCanalComunicacion;

public abstract class Colleague {

    protected ICanalComunicacion canalComunicacion;
    public Colleague(ICanalComunicacion mediator){
        this.canalComunicacion =mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
