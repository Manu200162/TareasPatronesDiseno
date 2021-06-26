package TareaEjercicios3erParcial.ejercicio1Decorator;

public class Personaje implements Component {
    private String nombre;
    private int nivel;
    private String armas;
    private double porcentajeDeArmadura;
    private double puntosAtaque;
    private double puntosDefensa;
    private double puntosRegeneracion;

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
    public double getPorcentajeDeArmadura() {
        return porcentajeDeArmadura;
    }
    @Override
    public void setPorcentajeDeArmadura(double porcentajeDeAramadura) {
        this.porcentajeDeArmadura = porcentajeDeAramadura;
    }
    @Override
    public double getPuntosAtaque() {
        return puntosAtaque;
    }
    @Override
    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }
    @Override
    public double getPuntosDefensa() {
        return puntosDefensa;
    }
    @Override
    public void setPuntosDefensa(double puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }
    @Override
    public double getPuntosRegeneracion() {
        return puntosRegeneracion;
    }
    @Override
    public void setPuntosRegeneracion(double puntosRegeneracion) {
        this.puntosRegeneracion = puntosRegeneracion;
    }

    @Override
    public void operation() {
        System.out.println("Caracteristicas iniciales personaje: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Nivel: "+nivel);
        System.out.println("Aramas: "+armas);
        System.out.println("Porcentaje de armadura: "+porcentajeDeArmadura);
        System.out.println("Puntos de ataque: "+puntosAtaque);
        System.out.println("Puntos de defensa: "+puntosDefensa);
        System.out.println("Puntos de regeneracion: "+puntosRegeneracion);
        System.out.println("-----------------------------------------------------");
    }
    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Nivel: "+nivel);
        System.out.println("Aramas: "+armas);
        System.out.println("Porcentaje de armadura: "+porcentajeDeArmadura);
        System.out.println("Puntos de ataque: "+puntosAtaque);
        System.out.println("Puntos de defensa: "+puntosDefensa);
        System.out.println("Puntos de regeneracion: "+puntosRegeneracion);
        System.out.println("-----------------------------------------------------");
    }
}
