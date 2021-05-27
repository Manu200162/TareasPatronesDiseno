package TareaIteratorListaEmpresas;

public class SegundaCom implements IList {

    private String[] nombres;
    private int position;

    public SegundaCom(){
        position=0;
        nombres=new String [5];
    }

    public void add(String value){
        nombres[position]=value;
        position++;
    }
    @Override
    public IteratorConcreteSegunda iterator() {
        return new  IteratorConcreteSegunda(this.nombres);
    }
}
