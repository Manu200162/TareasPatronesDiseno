package TareaVisitor.ejercicio1;

public class Complemento implements IPluguin{
    @Override
    public void agregandoPluguin(Word word) {
        System.out.println("***********************************************");
        System.out.println("Se esta creando un pdf para el texto del editor: WORD");
        System.out.println("El texto es: "+word.getTexto());
        char[]numCaracteres=word.getTexto().replace(" ","").toCharArray();
        System.out.println("El numero de caracteres es: "+numCaracteres.length);
        System.out.println("***********************************************");
    }

    @Override
    public void agregandoPluguin(Sublime sublime) {
        System.out.println("***********************************************");
        System.out.println("Se esta creando un pdf para el texto del editor: SUBLIME");
        System.out.println("El texto es: "+sublime.getTexto());
        char[]numCaracteres=sublime.getTexto().replace(" ","").toCharArray();
        System.out.println("El numero de caracteres es: "+numCaracteres.length);
        System.out.println("***********************************************");
    }

    @Override
    public void agregandoPluguin(NotePad notePad) {
        System.out.println("***********************************************");
        System.out.println("Se esta creando un pdf para el texto del editor: NOTEPAD");
        char[]numCaracteres=notePad.getTexto().replace(" ","").toCharArray();
        System.out.println("El texto es: "+notePad.getTexto());
        System.out.println("El numero de caracteres es: "+numCaracteres.length);
        System.out.println("***********************************************");
    }
}
