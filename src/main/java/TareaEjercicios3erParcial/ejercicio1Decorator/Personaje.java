package TareaEjercicios3erParcial.ejercicio1Decorator;

public class Personaje implements Component {
    //Personaje(nombre,nivel,armas,porcentajeDeArmadura, puntosAtaque, puntosDefensa, puntosRegeneracion)
    private String nombre;
    private int nivel;
    private String armas;
    private int porcentajeDeArmadura;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosRegeneracion;

    public Personaje(String nombre, int nivel,String armas){
        this.nombre=nombre;
        this.nivel=nivel;
        this.armas= armas;
        this.porcentajeDeArmadura=1;
        this.puntosAtaque=1;
        this.puntosDefensa=1;
        this.puntosRegeneracion=1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getNivel() {
        return nivel;
    }
    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    @Override
    public String getArmas() {
        return armas;
    }
    @Override
    public void setArmas(String armas) {
        this.armas = armas;
    }
    @Override
    public int getPorcentajeDeArmadura() {
        return porcentajeDeArmadura;
    }
    @Override
    public void setPorcentajeDeArmadura(int porcentajeDeAramadura) {
        this.porcentajeDeArmadura = porcentajeDeAramadura;
    }
    @Override
    public int getPuntosAtaque() {
        return puntosAtaque;
    }
    @Override
    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }
    @Override
    public int getPuntosDefensa() {
        return puntosDefensa;
    }
    @Override
    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }
    @Override
    public int getPuntosRegeneracion() {
        return puntosRegeneracion;
    }
    @Override
    public void setPuntosRegeneracion(int puntosRegeneracion) {
        this.puntosRegeneracion = puntosRegeneracion;
    }

    @Override
    public void operation() {
        //logica
        System.out.println("ComponentConcrete1 > operation");
    }
}
