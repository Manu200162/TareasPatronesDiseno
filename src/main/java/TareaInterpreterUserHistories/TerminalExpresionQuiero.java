package TareaInterpreterUserHistories;

public class TerminalExpresionQuiero extends AbstractExpresion {

    public TerminalExpresionQuiero(int tamanio){this.tamanio=tamanio;}
    @Override
    public void interpreter(Context context) {
        if (context.input.contains("Quiero")){
            context.output= context.output+"When";
            context.input= context.input.substring(6);
        }
    }
}
