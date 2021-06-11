package TareaStrategyTiendaRopa;

import java.util.List;

public class Invierno implements IEstrategiaVentas {
    @Override
    public void cambiarPrecio(List<PrendaRopa> prendas) {
        for(PrendaRopa ropa : prendas){
            int antPrecio = ropa.getPrecio();
            ropa.setPrecio(((antPrecio*10)/100)+antPrecio);
            System.out.println("Se aumento el 10% al precio la prenda");
            System.out.println("Precio anterior: "+antPrecio);
            System.out.println("******************Datos actualizados Invierno****************");
            ropa.showInfo();
            System.out.println("****************************************************");
        }
    }
    //10 % incrementa
}
