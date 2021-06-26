package TareaEjercicios3erParcial.ejercicio3Composite;

public class ArchivoSimple extends Archivo {


    public ArchivoSimple(String tipo, String nombreArchivo, String contenido, String peso) {
        super(tipo, nombreArchivo, contenido, peso);
    }

    @Override
    public int operation() {
        System.out.println(getNombreArchivo()+" numero de palabras : "+getNumPalabras()+" palabras");
        return this.getNumPalabras();
    }

    @Override
    public void add(Archivo component) {
        System.out.println("No aplica");
    }

    @Override
    public void remove(Archivo component) {
        System.out.println("No aplica");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplica");
    }
}
