package TareaInterpreterNumRomanos;

public class TerminalExpresionV extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("V") ){
            if (context.input.length() > 1){
                if (context.input.length() >= 2 && context.input.charAt(1)==','){
                    context.output=context.output+"5";
                    context.input=context.input.substring(1);
                }else if(context.input.length() >= 4 && context.input.charAt(3) == 'I'){
                    context.output=context.output+"8";
                    context.input=context.input.substring(4);
                } else if(context.input.length() >= 3 && context.input.charAt(2) == 'I'){
                    context.output=context.output+"7";
                    context.input=context.input.substring(3);
                }else if(context.input.length() >= 2  && context.input.charAt(1) == 'I'){
                    context.output=context.output+"6";
                    context.input=context.input.substring(2);
                }
            }else {
                context.output=context.output+"5";
                context.input=context.input.substring(1);
            }

        }
    }
}
