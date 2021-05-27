package TareaInterpreterUserHistories;

public class TerminalExpresionPara extends  AbstractExpresion{

    public TerminalExpresionPara(int tamanio){this.tamanio=tamanio;}
    @Override
    public void interpreter(Context context) {
        if (context.input.contains("Para")){
            context.output= context.output+"Then";
            context.input= context.input.substring(4);
        }
    }
}
