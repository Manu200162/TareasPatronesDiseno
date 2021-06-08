package TareaCommandVideojuego;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<IAccion> actionList = new ArrayList<>();

    public Invoker(){}

    public void addAction(IAccion accion){
        actionList.add(accion);
    }

    public void executeCommands(){
        for (IAccion action: actionList) {
            action.execute();
        }
        actionList.clear();
    }
}
