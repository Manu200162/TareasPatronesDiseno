package TareaBridge.ejercicio1;

public class Windows implements IPlataforma {
    private IArquitectura arquitectura;
    private String informacion;

    public Windows (IArquitectura arquitectura){
        this.arquitectura=arquitectura;
        informacion="Sistema operativo Windows en la decima version";
    }

    @Override
    public void informacion() {
        System.out.println(informacion);
    }

    @Override
    public void SetArquitectura() {
        System.out.println("Añadiendo arquitectura..........");
        arquitectura.setArquitectura();

    }
}
