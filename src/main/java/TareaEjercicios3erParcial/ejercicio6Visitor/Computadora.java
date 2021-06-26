package TareaEjercicios3erParcial.ejercicio6Visitor;

public class Computadora implements IObjetoElectronico {
    private String tipo;
    private String sistemaOperativo;
    private String cpu;

    public Computadora(String tipo, String sistemaOperativo, String cpu) {
        this.tipo = tipo;
        this.sistemaOperativo = sistemaOperativo;
        this.cpu = cpu;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void accept(IScannerElectronicos scannerElectronicos) {
        scannerElectronicos.realizarRevision(this);
    }
}
