package TareaEjercicios3erParcial.ejercicio1Decorator;

public interface Component {
    void operation();
    int getNivel();
    void setNivel(int nivel);
    String getArmas();
    void setArmas(String armas);
    int getPorcentajeDeArmadura();
    void setPorcentajeDeArmadura(int porcentajeDeArmadura);
    int getPuntosAtaque();
    void setPuntosAtaque(int puntosAtaque);
    int getPuntosDefensa();
    void setPuntosDefensa(int puntosDefensa);
    int getPuntosRegeneracion();
    void setPuntosRegeneracion(int puntosRecuperacion);


}
