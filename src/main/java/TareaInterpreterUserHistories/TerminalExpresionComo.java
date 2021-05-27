package TareaInterpreterUserHistories;

public class TerminalExpresionComo extends AbstractExpresion {

    public TerminalExpresionComo(int tamanio){this.tamanio=tamanio;}

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")){
            context.output= context.output+"Given";
            context.input= context.input.substring(4);
        }
    }
}
