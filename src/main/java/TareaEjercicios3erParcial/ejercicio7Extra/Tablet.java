package TareaEjercicios3erParcial.ejercicio7Extra;

public class Tablet  implements IComputadora{
    private String marca;
    private String modelo;
    private int pulgadas;
    private int tamanio;

    public Tablet(String marca, String modelo, int pulgadas, int tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.tamanio=tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    @Override
    public int getTamanio(){
        return this.tamanio;
    }

    @Override
    public void showInfoComputadora() {
        System.out.println("Informacion de la tablet: ");
        System.out.println("Marca :"+marca);
        System.out.println("Modelo :"+modelo);
        System.out.println("Pulgadas :"+pulgadas);
        System.out.println("Tamanio: "+tamanio+" cm");
        System.out.println("---------------------------------");
    }

    @Override
    public void recibirReparacion(IModoReparacion reparacion) {
         reparacion.recibirReparacion(this) ;
    }
}
