package TareaStrategyTiendaRopa;

import java.util.List;

public class Otonio implements  IEstrategiaVentas{
    @Override
    public void cambiarPrecio(List<PrendaRopa> prendas) {
        for(PrendaRopa ropa : prendas){
            int antPrecio = ropa.getPrecio();
            ropa.setPrecio(antPrecio-((antPrecio*50)/100));
            System.out.println("Se decremento el 50% al precio la prenda");
            System.out.println("Precio anterior: "+antPrecio);
            System.out.println("******************Datos actualizados Otoño****************");
            ropa.showInfo();
            System.out.println("****************************************************");
        }
    }
}
