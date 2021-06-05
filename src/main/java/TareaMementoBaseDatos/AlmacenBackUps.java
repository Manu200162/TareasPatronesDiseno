package TareaMementoBaseDatos;

import java.util.HashMap;
import java.util.Map;

public class AlmacenBackUps {

    private Map<String,Memento> stateSaved= new HashMap<>();

    public void createBackUp(String nombreBackUp, Memento memento){
        stateSaved.put(nombreBackUp,memento);
    }

    public Memento getMemento(String nombreBackUp){
        return stateSaved.get(nombreBackUp);
    }
}
