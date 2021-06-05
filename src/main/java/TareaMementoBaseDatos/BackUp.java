package TareaMementoBaseDatos;

public class BackUp {

    private BaseDatos state;

    public BackUp(){}

    public void setState(BaseDatos state) {
        System.out.println("**** Set State *****");
        state.ShowDB();
        this.state = state;
    }

    public Memento createBackUp(){
        System.out.println("**** Create State *****");
        state.ShowDB();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.ShowDB();
    }
}
