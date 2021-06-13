package TareaEjercicios2doParcial.MementoObserver_3;


public class Memento {
    private Codigo state;

    public Memento(Codigo stateSaved){
        this.state=stateSaved;
    }

    public Codigo getState() {
        return state;
    }
}
