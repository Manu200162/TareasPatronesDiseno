package TareaChainOfRespobsability.Ejercicio1;

public class Cliente {
    private String name;
    private String ci;
    private String solicitud;

    public Cliente(String name, String ci, String solicitud) {
        this.name = name;
        this.ci = ci;
        this.solicitud = solicitud;
    }

    public void showInfo(){
        System.out.println("Nombre: "+name);
        System.out.println("Ci: "+ci);
        System.out.println("Solicitud: "+solicitud);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }
}
