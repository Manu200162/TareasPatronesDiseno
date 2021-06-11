package TareaStrategyTiendaRopa;

import java.util.List;

public class Verano implements IEstrategiaVentas {
    @Override
    public void cambiarPrecio(List<PrendaRopa> prendas) {
        for(PrendaRopa ropa : prendas){
            int antPrecio = ropa.getPrecio();
            ropa.setPrecio(antPrecio-((antPrecio*10)/100));
            System.out.println("Se decremento el 10% al precio la prenda");
            System.out.println("Precio anterior: "+antPrecio);
            System.out.println("******************Datos actualizados Verano****************");
            ropa.showInfo();
            System.out.println("****************************************************");
        }
    }
}
