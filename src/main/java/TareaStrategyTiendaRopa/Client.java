package TareaStrategyTiendaRopa;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String [] args){
        TiendaRopa tiendaRopa = new TiendaRopa();
        tiendaRopa.setNombreTienda("Tienda 1");

        List<PrendaRopa> prendaRopas = new ArrayList<>();
        prendaRopas.add(new PrendaRopa("Polera",60,"L"));
        prendaRopas.add(new PrendaRopa("Pantalones",120,"S"));
        prendaRopas.add(new PrendaRopa("Medias",30,"M"));
        prendaRopas.add(new PrendaRopa("Zapatos",320,"39"));
        prendaRopas.add(new PrendaRopa("Chamarra",160,"XL"));
        prendaRopas.add(new PrendaRopa("Shorts",50,"M"));
        prendaRopas.add(new PrendaRopa("Polera",80,"XL"));
        prendaRopas.add(new PrendaRopa("Medias",25,"L"));
        prendaRopas.add(new PrendaRopa("Zapatos",600,"42"));
        prendaRopas.add(new PrendaRopa("Camisa",150,"M"));

        tiendaRopa.setPrendas(prendaRopas);

        tiendaRopa.setEstrategiaVentas(new Invierno());
        tiendaRopa.aplicarEstrategiaVenta();

        tiendaRopa.setEstrategiaVentas(new Verano());
        tiendaRopa.aplicarEstrategiaVenta();

        tiendaRopa.setEstrategiaVentas(new Otonio());
        tiendaRopa.aplicarEstrategiaVenta();

        tiendaRopa.setEstrategiaVentas(new Primavera());
        tiendaRopa.aplicarEstrategiaVenta();

    }
}
