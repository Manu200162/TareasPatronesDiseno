package TareaCommandVideojuego;

public class Videojuego {
    private String nombrePersonaje;
    private String categoria;
    private int cantidadDemunicion;
    private int nivelVida;

    public Videojuego(String nombrePersonaje, String categoria, int cantidadDemunicion, int nivelVida) {
        this.nombrePersonaje = nombrePersonaje;
        this.categoria = categoria;
        this.cantidadDemunicion=cantidadDemunicion;
        this.nivelVida=nivelVida;
    }

    public void showInfo(){
        System.out.println("####Nombre del personaje: "+nombrePersonaje+"####");
        System.out.println("####Categoria : "+categoria+"####");
    }

    public void disparar(){
        if(cantidadDemunicion>0){
            System.out.println("ACCION> se realizaron los disparos");
            cantidadDemunicion--;
            showInfo();
        }else{
            System.out.println("ACCION> no se realizan disparos debido a la falta de municion");
        }
    }
    public void modoDefensa(){
        if(nivelVida<40) {
            System.out.println("ACCION> el modo de defensa fue activado");
            showInfo();
        }else{
            System.out.println("ACCION> no se puede activar el modo defensa con la vida mayor a 40");
            System.out.println("Nivel de vida actual: "+nivelVida);
        }
    }

    public void ataque(){
        System.out.println("ACCION> el jugador intenta un ataque al enemigo");
        showInfo();
    }
}

