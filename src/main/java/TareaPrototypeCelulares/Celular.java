package TareaPrototypeCelulares;

public class Celular implements IModeloCelular{

    private String nombreModelo;
    private String cpu;
    private String memoriaInterna;
    private String versionAndroid;
    private String camara;
    private String versionBluetooth;
    private String tamanoMemoriaExterna;
    private String bateria;
    private String accesorios;
    private SIM sim;

    public Celular(){ }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreMmodelo) {
        this.nombreModelo = nombreMmodelo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(String memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getVersionBluetooth() {
        return versionBluetooth;
    }

    public void setVersionBluetooth(String versionBluetooth) {
        this.versionBluetooth = versionBluetooth;
    }

    public String getTamanoMemoriaExterna() {
        return tamanoMemoriaExterna;
    }

    public void setTamanoMemoriaExterna(String tamanoMemoriaExterna) {
        this.tamanoMemoriaExterna = tamanoMemoriaExterna;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    @Override
    public Object clone() {
        Celular celClonado = new Celular();
        celClonado.setNombreModelo(this.nombreModelo);
        celClonado.setCpu(this.cpu);
        celClonado.setMemoriaInterna(this.memoriaInterna);
        celClonado.setVersionAndroid(this.versionAndroid);
        celClonado.setCamara(this.camara);
        celClonado.setVersionBluetooth(this.versionBluetooth);
        celClonado.setTamanoMemoriaExterna(this.tamanoMemoriaExterna);
        celClonado.setBateria(this.bateria);
        celClonado.setAccesorios(this.accesorios);
        celClonado.setSim(this.sim);
        return celClonado;
    }
    public void mostrarCelulares(){
        System.out.println("******************************");
        System.out.println("Nombre del modelo: "+nombreModelo);
        System.out.println("Cpu: "+cpu);
        System.out.println("Memoria Interna: "+memoriaInterna);
        System.out.println("Version Android: "+versionAndroid);
        System.out.println("Camara: "+camara);
        System.out.println("Version Bluetooth: "+versionBluetooth);
        System.out.println("Tamaño memoria externa: "+tamanoMemoriaExterna);
        System.out.println("Bateria: "+bateria);
        System.out.println("Compañia celular: "+sim.getNombreComaniaCelular());
        System.out.println("Numero de celular: "+sim.getNumeroCelular());
        System.out.println("******************************");
    }
}
