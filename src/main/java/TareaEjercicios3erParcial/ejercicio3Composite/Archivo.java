package TareaEjercicios3erParcial.ejercicio3Composite;

public abstract class Archivo {
    private String tipo;
    private String nombreArchivo;
    private String contenido;
    private String peso;
    private int numPalabras;

    public Archivo(String tipo){
        this.tipo= tipo;
    }

    public Archivo(String tipo,String nombreArchivo, String contenido, String peso) {
        this.tipo=tipo;
        this.nombreArchivo = nombreArchivo;
        this.contenido = contenido;
        this.peso = peso;
        this.numPalabras= contarPalabras(contenido);
    }


    public int contarPalabras(String texto){
        int contadorPalabras=0;
        for(String palabra : texto.split(" ")){
            if(!palabra.equals(""))
            contadorPalabras++;
        }
        return  contadorPalabras;
    }

    public String getTipo() {
        return tipo;
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }

    public int getNumPalabras() {
        return numPalabras;
    }

    public abstract int operation();
    public abstract void add(Archivo component);
    public abstract void remove(Archivo component);
    public abstract void getChild(int position);
}
