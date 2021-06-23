package TareaBridge.ejercicio2;

public class EnvioAire implements IEnvio{
    @Override
    public void enviar(Paquete paquete) {
        double costoEnvio= paquete.getPrecio()*0.1;
        System.out.println("Se enviara el paquete por aire");
        System.out.println("El costo de envio es: "+costoEnvio+" Dolares");
        System.out.println("El costo total es de: "+(paquete.getPrecio()+costoEnvio)+" Dolares");
        System.out.println("El nombre del paquete es: "+paquete.getNomprePaquete());
        System.out.println("*********************************************************");
    }
}
