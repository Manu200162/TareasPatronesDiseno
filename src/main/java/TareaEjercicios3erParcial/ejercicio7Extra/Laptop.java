package TareaEjercicios3erParcial.ejercicio7Extra;

public class Laptop implements IComputadora{
    private String marca;
    private int pulgadas;
    private boolean isNew;
    private int tamanio;

    public Laptop(String marca, int pulgadas, boolean isNew, int tamanio) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.isNew = isNew;
        this.tamanio=tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    @Override
    public int getTamanio(){
        return this.tamanio;
    }

    @Override
    public void showInfoComputadora() {
        System.out.println("Informacion de la laptop: ");
        System.out.println("Marca: "+marca);
        System.out.println("Pulgadas: "+pulgadas+" pulgadas");
        System.out.println("Es nueva: "+isNew);
        System.out.println("Tamanio: "+tamanio+" cm");
        System.out.println("---------------------------------");
    }

    @Override
    public void recibirReparacion(IModoReparacion reparacion) {
        reparacion.recibirReparacion(this);
    }
}
