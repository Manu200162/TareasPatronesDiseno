package TareaStrategyTiendaRopa;

import java.util.List;

public class Primavera implements IEstrategiaVentas {
    @Override
    public void cambiarPrecio(List<PrendaRopa> prendas) {
        for(PrendaRopa ropa : prendas){
            int antPrecio = ropa.getPrecio();
            System.out.println("El precio se mantiene en primavera");
            System.out.println("******************Datos Prenda Primavera****************");
            ropa.showInfo();
            System.out.println("****************************************************");
        }
    }
}
