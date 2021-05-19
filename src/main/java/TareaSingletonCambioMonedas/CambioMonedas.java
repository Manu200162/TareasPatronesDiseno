package TareaSingletonCambioMonedas;

import java.util.Date;

public class CambioMonedas {
   public static CambioMonedas instancia = null;

   private CambioMonedas(){
       System.out.println(new Date().getTime() + "******Instanciando Cambiador De Monedas*********");
   }
   public static CambioMonedas getInstance (){
        if(instancia == null)
            instancia= new CambioMonedas();
        return instancia;
   }

   public void info(String info){
       System.out.println(info);
   }

    public void realizarCambio(double cantidad , Moneda inicial, String cambio){
          if (inicial.getNombre() == "Dolares" && cambio.equals("Dolares")){
             System.out.println(cantidad+" $ ");
          }else if (inicial.getNombre().equals("Bolivianos") && cambio.equals("Bolivianos")){
              System.out.println(cantidad+" Bs. ");
          }else if (inicial.getNombre().equals("Euros") && cambio.equals("Euros")){
              System.out.println(cantidad+" € ");
          }else if (inicial.getNombre().equals("Dolares") && cambio.equals("Bolivianos")){
              System.out.println(cantidad*6.97+" Bs.");
          }else if (inicial.getNombre().equals("Dolares") && cambio.equals("Euros")){
              System.out.println(cantidad/0.82+" € ");
          }else if (inicial.getNombre().equals("Bolivianos") && cambio.equals("Dolares")){
              System.out.println(cantidad*inicial.getValorEnDolares()+" $ ");
          }else if (inicial.getNombre().equals("Bolivianos") && cambio.equals("Euros")){
              System.out.println((cantidad* inicial.getValorEnDolares())/0.82 + " € ");
          }else if (inicial.getNombre().equals("Euros") && cambio.equals("Bolivianos")){
              System.out.println((cantidad* inicial.getValorEnDolares())*6.97+" Bs. ");
          }else if (inicial.getNombre().equals("Euros") && cambio.equals("Dolares")){
              System.out.println(cantidad*inicial.getValorEnDolares()+" $ ");
          }else{
              System.out.println("No se puede realizar el cambio");
          }
    }
}
