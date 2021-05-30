package TareaExtraPrimerParcial.factoryMethod;

public class Create_Kit_colegial extends CreatorKits{
    @Override
    public IKit creator() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(8);
        mochila.setTamanio("Grande");

        Libros libros =new Libros();
        libros.setTipo("Matematicas aplicadas");
        libros.setAutor("Arturo perez");

        Computadora computadora = new Computadora();
        computadora.setMarca("Lenovo");
        computadora.setOs("Windows 10 home");

        Kit_colegial kit_colegial= new Kit_colegial();
        kit_colegial.setMochila(mochila);
        kit_colegial.setLibros(libros);
        kit_colegial.setComputadora(computadora);

        return kit_colegial;
    }
}
