package TareaCommandVideojuego;

public class Disparos implements IAccion{
    private Videojuego vjuego;

    public Disparos(Videojuego vjuego) {
        this.vjuego = vjuego;
    }

    @Override
    public void execute() {
        System.out.println("La municion disminuye");
        vjuego.disparar();
    }
}
