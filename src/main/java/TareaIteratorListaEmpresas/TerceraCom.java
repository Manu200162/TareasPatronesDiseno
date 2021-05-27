package TareaIteratorListaEmpresas;

import java.util.Vector;

public class TerceraCom implements IList {
    private Vector<String> nombres;

    public TerceraCom(){
        nombres= new Vector<>();
    }
    public void add(String value){
        nombres.add(value);
    }

    @Override
    public IteratorConcreteTercera iterator() {
        return new IteratorConcreteTercera(this.nombres);
    }

}
