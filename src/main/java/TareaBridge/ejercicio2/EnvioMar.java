package TareaBridge.ejercicio2;

public class EnvioMar implements IEnvio{
    @Override
    public void enviar(Paquete paquete) {
        double costoEnvio= paquete.getPrecio()*0.25;
        System.out.println("Se enviara el paquete por el mar");
        System.out.println("El costo de envio es: "+costoEnvio+" Dolares");
        System.out.println("El costo total es de: "+(paquete.getPrecio()+costoEnvio)+" Dolares");
        System.out.println("El nombre del paquete es: "+paquete.getNomprePaquete());
        System.out.println("*********************************************************");
    }
}
