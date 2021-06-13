package TareaeEjercicios2doParcial.MementoObserver_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class AnexoComunicador implements ICanal{
    List<IDesarrollador> ovserverList = new ArrayList<>();


    @Override
    public void attach(IDesarrollador observer) {
        ovserverList.add(observer);
    }

    @Override
    public void deattach(IDesarrollador observer) {
        ovserverList.remove(observer);
    }

    @Override
    public void notifyObserver(Codigo codigo) {
        for(IDesarrollador desarrollador: ovserverList){
            desarrollador.update("Se restauro un commit:",codigo);
        }
    }
}
