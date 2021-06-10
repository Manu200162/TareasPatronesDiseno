package TareaStateComputadora;

import java.util.List;

public class Computadora {

    private IStateComputadora state;
    private List<String> listaProgramas;
    private int usoCpu;
    private int usoMemoriaRam;



    public IStateComputadora getState() {
        return state;
    }

    public void request(){
        this.state.handler(this);
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public List<String> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(List<String> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public int getUsoCpu() {
        return usoCpu;
    }

    public void setUsoCpu(int usoCpu) {
        this.usoCpu = usoCpu;
    }

    public int getUsoMemoriaRam() {
        return usoMemoriaRam;
    }

    public void setUsoMemoriaRam(int usoMemoriaRam) {
        this.usoMemoriaRam = usoMemoriaRam;
    }
}
