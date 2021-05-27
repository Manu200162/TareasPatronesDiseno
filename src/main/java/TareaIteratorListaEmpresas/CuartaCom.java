package TareaIteratorListaEmpresas;

import java.util.Stack;

public class CuartaCom implements IList{

    Stack<String> nombres;

    public CuartaCom(){
        nombres= new Stack<>();
    }
    public void add(String value){
        nombres.push(value);
    }


    @Override
    public IteratorConcreteCuarta iterator() {
        return new IteratorConcreteCuarta(this.nombres) ;
    }
}
