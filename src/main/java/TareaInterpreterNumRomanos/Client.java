package TareaInterpreterNumRomanos;

public class Client {
    public static void main (String [] args){

        String interpretar1="I II III IV V VI VII VIII IX X";
        NoTerminalExpresion parser= new NoTerminalExpresion(interpretar1);
        String interpretado = parser.interpretar();
        System.out.println("************************************************");
        System.out.println("Interpretacion: "+ interpretar1);
        System.out.println("Interpretado: "+ interpretado);
        System.out.println("************************************************");

        String interpretar2="X IX VIII VII VI V IV III II I";
        NoTerminalExpresion parser2= new NoTerminalExpresion(interpretar2);
        String interpretado2 = parser2.interpretar();
        System.out.println("************************************************");
        System.out.println("Interpretacion: "+ interpretar2);
        System.out.println("Interpretado: "+ interpretado2);
        System.out.println("************************************************");

        String interpretar3="I II III X II VII IX ";
        NoTerminalExpresion parser3= new NoTerminalExpresion(interpretar3);
        String interpretado3 = parser3.interpretar();
        System.out.println("************************************************");
        System.out.println("Interpretacion: "+ interpretar3);
        System.out.println("Interpretado: "+ interpretado3);
        System.out.println("************************************************");

        String interpretar4="X V I III IV IX X X VIII";
        NoTerminalExpresion parser4= new NoTerminalExpresion(interpretar4);
        String interpretado4 = parser4.interpretar();
        System.out.println("************************************************");
        System.out.println("Interpretacion: "+ interpretar4);
        System.out.println("Interpretado: "+ interpretado4);
        System.out.println("************************************************");
    }
}
