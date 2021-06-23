package TareaBridge.ejercicio1.noBridge;

public class Linux implements IPlataforma{
    @Override
    public void informacionSistema() {
        System.out.println("Linux se esta utilizando en la distribuicion de Ubuntu");
    }
}
