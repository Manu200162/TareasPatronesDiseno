package TareaEjercicios3erParcial.ejercicio1Decorator;

public interface Component {
    void operation();
    int getNivel();
    void setNivel(int nivel);
    String getArmas();
    void setArmas(String armas);
    double getPorcentajeDeArmadura();
    void setPorcentajeDeArmadura(double porcentajeDeArmadura);
    double getPuntosAtaque();
    void setPuntosAtaque(double puntosAtaque);
    double getPuntosDefensa();
    void setPuntosDefensa(double puntosDefensa);
    double getPuntosRegeneracion();
    void setPuntosRegeneracion(double puntosRecuperacion);


}
