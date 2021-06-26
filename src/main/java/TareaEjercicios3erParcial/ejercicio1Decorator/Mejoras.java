package TareaEjercicios3erParcial.ejercicio1Decorator;

public class Mejoras implements  Component {

    private Component component;

    public Mejoras(Component component){
        this.component=component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }

    @Override
    public int getNivel() {
        return component.getNivel();
    }

    @Override
    public void setNivel(int nivel) {
        component.setNivel(nivel);
    }

    @Override
    public String getArmas() {
        return component.getArmas();
    }

    @Override
    public void setArmas(String armas) {
        component.setArmas(armas);
    }

    @Override
    public int getPorcentajeDeArmadura() {
        return component.getPorcentajeDeArmadura();
    }

    @Override
    public void setPorcentajeDeArmadura(int porcentajeDeArmadura) {
        component.setPorcentajeDeArmadura(porcentajeDeArmadura);
    }

    @Override
    public int getPuntosAtaque() {
        return component.getPuntosAtaque();
    }

    @Override
    public void setPuntosAtaque(int puntosAtaque) {
        component.setPuntosAtaque(puntosAtaque);
    }

    @Override
    public int getPuntosDefensa() {
        return component.getPuntosDefensa();
    }

    @Override
    public void setPuntosDefensa(int puntosDefensa) {
        component.setPuntosDefensa(puntosDefensa);
    }

    @Override
    public int getPuntosRegeneracion() {
        return component.getPuntosRegeneracion();
    }

    @Override
    public void setPuntosRegeneracion(int puntosRecuperacion) {
        component.setPuntosRegeneracion(puntosRecuperacion);
    }
}
