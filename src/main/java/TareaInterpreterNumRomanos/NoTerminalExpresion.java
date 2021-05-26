package TareaInterpreterNumRomanos;

import java.util.ArrayList;
import java.util.List;

public class NoTerminalExpresion extends AbstractExpresion {

    private List<AbstractExpresion> parseTree = new ArrayList<>();
    private Context context;


    public NoTerminalExpresion(String word) {
        this.interpretacion(word);

    }

    public void interpretacion (String words){
        String input = words;
        //context= new Context(input);
        context=new Context(input.replace(" ",","));
        for (String word: input.split(" ")){
            switch(word){
                case   "I":
                case"II":
                case"III":
                case"IV":
                case"IX":
                    parseTree.add(new TerminalExpresionI());
                    parseTree.add(new TerminalExpresionSpace());
                    break;
                case"V":
                case"VI":
                case"VII":
                case"VIII":
                    parseTree.add(new TerminalExpresionV());
                    parseTree.add(new TerminalExpresionSpace());
                    break;
                case"X":
                    parseTree.add(new TerminalExpresionX());
                    parseTree.add(new TerminalExpresionSpace());
                    break;
                //case" ":
                 //   parseTree.add(new TerminalExpresionSpace());
                 //   break;
                default:
                    break;

            }

        }
    }

    @Override
    public void interpreter(Context context) {


    }
    public String interpretar(){
        for(AbstractExpresion terminalExpresion: parseTree){
            terminalExpresion.interpreter(context);
            //context.output= (context.output+" ");
        }
        return context.output;
    }
}
