package TareaeEjercicios2doParcial.Memento_1;

public class EstadoTesis {
    private Tesis state;

    public EstadoTesis(){}

    public void setState(Tesis state) {
        System.out.println("**** Set State *****");
        state.showInfo();
        this.state = state;
    }

    public Memento createRevision(){
        System.out.println("**** Create State *****");
        state.showInfo();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.showInfo();
    }
}
