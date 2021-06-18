package TareaVisitor.ejercicio1;

public class NotePad implements IEditorTexto{
    private String version;
    private boolean licencia;
    private String herramientas;
    private String texto;


    public NotePad() { }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }
    public void crear(String texto){
        this.texto=texto;
    }

    public void eliminar(){
        this.texto="";
    }
    public void editar(String texto){
        this.texto=texto+" "+texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void accept(IPluguin complemento) {
        complemento.agregandoPluguin(this);
    }
}
