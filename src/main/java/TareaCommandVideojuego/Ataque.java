package TareaCommandVideojuego;

public class Ataque implements IAccion{
    private Videojuego vjuego;

    public Ataque(Videojuego vjuego) {
        this.vjuego = vjuego;
    }

    @Override
    public void execute() {
        System.out.println("Ataque de magitud medida");
        vjuego.ataque();
    }
}
