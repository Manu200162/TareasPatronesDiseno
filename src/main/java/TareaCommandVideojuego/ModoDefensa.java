package TareaCommandVideojuego;

public class ModoDefensa implements IAccion{
    private Videojuego vjuego;

    public ModoDefensa(Videojuego vjuego) {
        this.vjuego = vjuego;
    }

    @Override
    public void execute() {
        System.out.println("La defensa no resistira por mucho tiempo");
        vjuego.modoDefensa();
    }
}
