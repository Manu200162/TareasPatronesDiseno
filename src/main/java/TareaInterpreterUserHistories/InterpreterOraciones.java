package TareaInterpreterUserHistories;

import java.util.ArrayList;
import java.util.List;

public class InterpreterOraciones extends AbstractExpresion{

    private List<AbstractExpresion> parseTree=new ArrayList<>();
    private Context context;
    public InterpreterOraciones(String word){
        this.interpretacion(word);
    }

    public void interpretacion(String oraciones){
        String input =oraciones;
        context=new Context(input.replace(" ",""));
        for (String word : input.split(" ")){
            switch (word){
                case"Como":
                    parseTree.add(new TerminalExpresionComo(word.length()));
                    break;
                case"Para":
                    parseTree.add(new TerminalExpresionPara(word.length()));
                    break;
                case"Quiero":
                    parseTree.add(new TerminalExpresionQuiero(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpresionSpace(word.length()));
                    break;


            }
        }
    }
    public String interpretar(){
        for (AbstractExpresion ae : parseTree){
            ae.interpreter(context);
            context.output= (context.output+" ");
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
