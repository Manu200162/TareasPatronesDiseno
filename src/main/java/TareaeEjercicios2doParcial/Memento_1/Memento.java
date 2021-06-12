package TareaeEjercicios2doParcial.Memento_1;

public class Memento {
    private Tesis state;

    public Memento(Tesis stateSaved){
        this.state=stateSaved;
    }

    public Tesis getState() {
        return state;
    }
}
