package TareaEjercicios3erParcial.ejercicio1Decorator;

public class Mejoras implements  Component {

    private Component component;

    public Mejoras(Component component){
        this.component=component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
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
    public double getPorcentajeDeArmadura() {
        return component.getPorcentajeDeArmadura();
    }

    @Override
    public void setPorcentajeDeArmadura(double porcentajeDeArmadura) {
        component.setPorcentajeDeArmadura(porcentajeDeArmadura);
    }

    @Override
    public double getPuntosAtaque() {
        return component.getPuntosAtaque();
    }

    @Override
    public void setPuntosAtaque(double puntosAtaque) {
        component.setPuntosAtaque(puntosAtaque);
    }

    @Override
    public double getPuntosDefensa() {
        return component.getPuntosDefensa();
    }

    @Override
    public void setPuntosDefensa(double puntosDefensa) {
        component.setPuntosDefensa(puntosDefensa);
    }

    @Override
    public double getPuntosRegeneracion() {
        return component.getPuntosRegeneracion();
    }

    @Override
    public void setPuntosRegeneracion(double puntosRecuperacion) {
        component.setPuntosRegeneracion(puntosRecuperacion);
    }
}
