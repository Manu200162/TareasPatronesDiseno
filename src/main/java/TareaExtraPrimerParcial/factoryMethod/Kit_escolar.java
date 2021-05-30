package TareaExtraPrimerParcial.factoryMethod;

public class Kit_escolar implements IKit{
    //mochila (numero bolsillos, tamaño),
    //deportivo (talla, color, número de prendas), cuadernos(tipo, #hojas)
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuadernos cuadernos;


    public Kit_escolar(){
        mochila=new Mochila();
        deportivo=new Deportivo();
        cuadernos=new Cuadernos();
    }


    @Override
    public void crear() {
        System.out.println("******************************************");
        System.out.println("Kit_escolar");
        mochila.showInfo();
        deportivo.showInfo();
        cuadernos.showInfo();
        System.out.println("******************************************");
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }
}
