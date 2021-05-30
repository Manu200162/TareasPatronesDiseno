package TareaExtraPrimerParcial.factoryMethod;

public class Computadora {
    //computadora(marca, os)

    private String marca;
    private String os;

    public Computadora(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void showInfo(){
        System.out.println("Computadora marca:"+marca);
        System.out.println("Computadora os:"+os);
    }
}
