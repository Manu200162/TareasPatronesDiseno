package TareaEjercicios2doParcial.Memento_1;

import java.util.HashMap;
import java.util.Map;

public class AlmacenRevisiones {
    private Map<Integer,Memento> stateSaved= new HashMap<>();

    public void createVersion(int numRevision, Memento memento){
        stateSaved.put(numRevision,memento);
    }

    public Memento getMemento(int numRevision){
        return stateSaved.get(numRevision);
    }
}
