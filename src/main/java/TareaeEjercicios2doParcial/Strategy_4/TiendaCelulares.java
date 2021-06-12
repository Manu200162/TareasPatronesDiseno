package TareaeEjercicios2doParcial.Strategy_4;

import java.util.List;

public class TiendaCelulares {
    private IModoBusqueda modoBusqueda;
    private List<Celular> celularList;


    public TiendaCelulares(){}

    public IModoBusqueda getModoBusqueda() {
        return modoBusqueda;
    }

    public void setModoBusqueda(IModoBusqueda modoBusqueda) {
        this.modoBusqueda = modoBusqueda;
    }

    public List<Celular> getCelularList() {
        return celularList;
    }

    public void setCelularList(List<Celular> celularList) {
        this.celularList = celularList;
    }

    public void usarModuloDeBusqueda(String consulta){
        modoBusqueda.realizarBusqueda(celularList,consulta);
    }
}
