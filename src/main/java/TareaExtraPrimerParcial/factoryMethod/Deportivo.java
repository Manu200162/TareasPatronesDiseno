package TareaExtraPrimerParcial.factoryMethod;

public class Deportivo {
    //deportivo (talla, color, número de prendas)
    private String talla;
    private String color;
    private int numeroPrendas;


    public Deportivo(){}

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumveroPrendas() {
        return numeroPrendas;
    }

    public void setNumveroPrendas(int numveroPrendas) {
        this.numeroPrendas = numveroPrendas;
    }

    public void showInfo(){
        System.out.println("Deportivo talla: "+talla);
        System.out.println("Deportivo color: "+color);
        System.out.println("Deportivo numeroPrendas: "+numeroPrendas);
    }
}
