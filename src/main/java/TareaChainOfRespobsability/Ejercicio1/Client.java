package TareaChainOfRespobsability.Ejercicio1;

public class Client {

    public static void main(String[] args){
        RealizadorConsultas realizadorConsultas = new RealizadorConsultas();

        realizadorConsultas.realizarSolicitud(new Cliente(
                "Jose1","45689754","costos del programa"));
        realizadorConsultas.realizarSolicitud(new Cliente(
                "Jose2","70235689","infraestructura de la aplicacion"));
        realizadorConsultas.realizarSolicitud(new Cliente(
                "Jose3","63026589","Mejora para la interfaz de usuario"));
        realizadorConsultas.realizarSolicitud(new Cliente(
                "Jose4","23001456","nuevas caracteristicas del sistema"));
        realizadorConsultas.realizarSolicitud(new Cliente(
                "Jose5","10234568","nueva funcionalidad para el reciclaje de archivos"));


    }
}
