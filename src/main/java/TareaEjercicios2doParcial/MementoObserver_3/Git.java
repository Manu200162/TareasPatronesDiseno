package TareaEjercicios2doParcial.MementoObserver_3;

public class Git {
    private Codigo state;
    private AnexoComunicador anexoComunicador;

    public Git(AnexoComunicador comunicador){
        this.anexoComunicador= comunicador;
    }

    public void setState(Codigo state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
        anexoComunicador.notifyObserver(state);
        ///llamar al metodo del canal de comunicacion para manar notificaciones a desarroladores
    }

}
