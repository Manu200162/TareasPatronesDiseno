package TareaSingletonCambioMonedas;

public class LibreCambistas {
 public LibreCambistas(){

 }
 public void cambio (double cantidad, Moneda inicial, String cambioMoneda){
  System.out.print("El cambio para "+cantidad+" "+inicial.getSimbolo()+" es: ");
  CambioMonedas.getInstance().realizarCambio(cantidad,inicial,cambioMoneda);

 }
}
