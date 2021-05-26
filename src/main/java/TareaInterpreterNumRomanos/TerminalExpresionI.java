package TareaInterpreterNumRomanos;

public class TerminalExpresionI extends AbstractExpresion{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("I") ){
            if (context.input.length() > 1){
            if (context.input.length() >= 2 && context.input.charAt(1)==','){
                context.output=context.output+"1";
                context.input=context.input.substring(1);
            }else if(context.input.length() >= 3 && context.input.charAt(2) == 'I'){
                context.output=context.output+"3";
                context.input=context.input.substring(3);
            }else if(context.input.length() >= 2  && context.input.charAt(1) == 'I'){
                context.output=context.output+"2";
                context.input=context.input.substring(2);
            }else if(context.input.length() >= 2 && context.input.charAt(1) =='V'){
                context.output=context.output+"4";
                context.input=context.input.substring(2);
            }else if(context.input.length() >= 2 && context.input.charAt(1) =='X'){
                context.output=context.output+"9";
                context.input=context.input.substring(2);
            }
            }else {
                context.output=context.output+"1";
                context.input=context.input.substring(1);
            }

        }
    }
}
