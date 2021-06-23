package TareaBridge.ejercicio1;

public class Linux implements IPlataforma {
    private IArquitectura arquitectura;
    private String informacion;

    public Linux(IArquitectura arquitectura){
        this.arquitectura=arquitectura;
        informacion="Sistema operativo Linux utilizando la distribucion de centOS 7";
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
