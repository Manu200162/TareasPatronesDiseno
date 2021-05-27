package TareaIteratorListaEmpresas;

import java.util.Vector;

public class IteratorConcreteTercera implements Iterator{

    private Vector<String> nombres;
    private int position;

    public IteratorConcreteTercera(Vector<String> nombres){
        this.nombres=nombres;
        this.position=0;
    }

    @Override
    public String next() {
        return this.nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size() != 0 && this.nombres.size() > position;
    }
}

