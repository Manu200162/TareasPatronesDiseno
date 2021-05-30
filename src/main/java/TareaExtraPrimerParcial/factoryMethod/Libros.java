package TareaExtraPrimerParcial.factoryMethod;

public class Libros {
    //libros(tipo, autor)
    private String tipo;
    private String autor;

    public Libros(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void showInfo(){
        System.out.println("Libros tipo:"+tipo);
        System.out.println("Libros autor:"+autor);
    }
}
