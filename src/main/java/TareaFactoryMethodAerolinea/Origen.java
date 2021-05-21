package TareaFactoryMethodAerolinea;

public class Origen {
    //origen (pais, ciudad, aeropuerto)
    private String pais;
    private String ciudad;
    private String aeropuerto;

    public Origen(){}

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
    public void showInfo(){
        System.out.println("origen pais: "+pais);
        System.out.println("origen ciudad: "+ciudad);
        System.out.println("origen aeropuerto: "+aeropuerto);
    }
 }
