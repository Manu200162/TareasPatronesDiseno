package TareaInterpreterUserHistories;

public class TerminalExpresionSpace extends AbstractExpresion {


    public TerminalExpresionSpace(int tamanio){this.tamanio=tamanio;}
    @Override
    public void interpreter(Context context) {
    String copia= context.input;
    System.out.println("Tamanio: "+ this.tamanio);
    System.out.println("Copia: "+copia);
    context.output=context.output.concat(copia.substring(0,this.tamanio));
    context.input=context.input.substring(this.tamanio);
    }
}
