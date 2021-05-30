package TareaExtraPrimerParcial.factoryMethod;

public class Kit_colegial implements IKit {
//mochila(numero bolsillos, tamano), libros(tipo, autor), computadora(marca, os).
    private Mochila mochila;
    private Libros libros;
    private Computadora computadora;

    public Kit_colegial(){
        mochila=new Mochila();
        libros=new Libros();
        computadora=new Computadora();
    }

    @Override
    public void crear() {
        System.out.println("******************************************");
        System.out.println("Kit_colegial");
        mochila.showInfo();
        libros.showInfo();
        computadora.showInfo();
        System.out.println("******************************************");
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
