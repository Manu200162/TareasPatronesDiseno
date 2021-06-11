package TareaStrategyTiendaRopa;

import java.util.ArrayList;
import java.util.List;

public class TiendaRopa {

    private IEstrategiaVentas estrategiaVentas;
    private List<PrendaRopa> prendas = new ArrayList<>();
    private String nombreTienda;

    public IEstrategiaVentas getEstrategiaVentas() {
        return estrategiaVentas;
    }

    public void setEstrategiaVentas(IEstrategiaVentas estrategiaVentas) {
        this.estrategiaVentas = estrategiaVentas;
    }

    public void aplicarEstrategiaVenta(){
        estrategiaVentas.cambiarPrecio(this.prendas);
    }

    public List<PrendaRopa> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<PrendaRopa> prendas) {
        this.prendas = prendas;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
}
