package TareaIteratorListaEmpresas;

public class IteratorConcreteSegunda implements Iterator {

    private String[]nombres;
    private int position;

    public IteratorConcreteSegunda(String[]nombres){
        this.nombres=nombres;
    }

    @Override
    public String next() {
        return nombres[position++];
    }

    @Override
    public boolean hasNext() {
        return nombres.length !=0 && position < nombres.length;
    }
}
