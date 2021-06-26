package TareaEjercicios3erParcial.ejercicio6Visitor;

public class Celular implements IObjetoElectronico{
    private String modelo;
    private String imei;
    private String antiguedad;
    private String sistemaOperativo;

    public Celular(String modelo, String imei, String antiguedad, String sistemaOperativo) {
        this.modelo = modelo;
        this.imei = imei;
        this.antiguedad = antiguedad;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void showInfo(){
        System.out.println("Modelo: "+modelo);
        System.out.println("IMEI: "+imei);
        System.out.println("Años de uso: "+antiguedad+" Años");
        System.out.println("Sistema operativo: "+sistemaOperativo);
    }

    @Override
    public void accept(IScannerElectronicos scannerElectronicos) {
        scannerElectronicos.realizarRevision(this);
    }
}
