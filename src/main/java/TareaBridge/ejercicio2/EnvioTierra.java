package TareaBridge.ejercicio2;

public class EnvioTierra implements IEnvio{
    @Override
    public void enviar(Paquete paquete) {
        double costoEnvio= paquete.getPrecio()*0.05;
        System.out.println("Se enviara el paquete por tierra");
        System.out.println("El costo de envio es: "+costoEnvio+" Dolares");
        System.out.println("El costo total es de: "+(paquete.getPrecio()+costoEnvio)+" Dolares");
        System.out.println("El nombre del paquete es: "+paquete.getNomprePaquete());
        System.out.println("*********************************************************");
    }
}
