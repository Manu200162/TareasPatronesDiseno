package TareaIteratorListaEmpresas;

import java.util.List;

public class IteratorConcretePrimera implements Iterator {
    private List<String>nombres;
    private int position;

    public IteratorConcretePrimera(List<String> nombres){
        this.nombres=nombres;
        this.position=0;
    }


    @Override
    public String next() {
        return this.nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size() !=0 && this.nombres.size() > position;
    }
}
