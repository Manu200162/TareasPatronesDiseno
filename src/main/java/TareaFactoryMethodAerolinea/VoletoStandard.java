package TareaFactoryMethodAerolinea;

public class VoletoStandard implements IVoletoAvion {

    private int numeroVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoPasaje;

    public VoletoStandard(){
        destino= new Destino();
        origen= new Origen();
        avion= new Avion();
        pasajero= new Pasajero();
    }

    @Override
    public void crear() {
        System.out.println("***************************************************");
        System.out.println("Voleto standard numero de vuelo: "+numeroVuelo);
       System.out.println("Voleto standard numero de asiento: "+numeroAsiento);
       System.out.println("Voleto standard costo pasaje: "+costoPasaje);
       destino.showInfo();
       origen.showInfo();
       avion.showInfo();
       pasajero.showInfo();
        System.out.println("***************************************************");
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public  String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
}
