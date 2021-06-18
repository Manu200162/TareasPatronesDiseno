package TareaVisitor.ejercicio1;

public class Client {

    public static void main(String[] args){


            Word word = new Word();
            word.setHerramientas("Editor de texto, Corrector de texto");
            word.crear("Este es un documento de prueba para word");
            Sublime sublime= new Sublime();
            word.setHerramientas("Editor de texto, editor de codigo");
            sublime.crear("Este texto sera de prueba para el sublime");

            NotePad notePad = new NotePad();
            notePad.crear("Este texto es de prueba para el notepad");

            Complemento complemento = new Complemento();

            word.accept(complemento);
            sublime.accept(complemento);
            notePad.accept(complemento);

    }
}
