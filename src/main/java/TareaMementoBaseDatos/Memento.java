package TareaMementoBaseDatos;

public class Memento {
    private BaseDatos state;

    public Memento(BaseDatos stateSaved){
        this.state=stateSaved;
    }

    public BaseDatos getState() {
        return state;
    }
}
