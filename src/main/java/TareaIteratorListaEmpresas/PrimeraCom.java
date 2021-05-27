package TareaIteratorListaEmpresas;

import java.util.ArrayList;
import java.util.List;

public class PrimeraCom implements IList {

    private List<String> nombres;

    public PrimeraCom(){

        nombres= new ArrayList<String>();
    }

    public void add(String value){

        nombres.add(value);
    }

    @Override
    public IteratorConcretePrimera iterator() {
        return new IteratorConcretePrimera(this.nombres);
    }
}
