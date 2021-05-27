package TareaIteratorListaEmpresas;

import java.util.Stack;

public class IteratorConcreteCuarta implements Iterator {

    private Stack<String> nombres;

    public IteratorConcreteCuarta(Stack<String> nombres){
        this.nombres=nombres;
    }


    @Override
    public String next() {
        return this.nombres.pop();
    }

    @Override
    public boolean hasNext() {
        return this.nombres.size() != 0;
    }
}
