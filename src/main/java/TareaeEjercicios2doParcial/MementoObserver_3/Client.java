package TareaeEjercicios2doParcial.MementoObserver_3;

public class Client {
    public static void main (String []argsss ){

        Github github = new Github();
        AnexoComunicador comunicador = new AnexoComunicador();
        Desarrollador desarrollador1=new Desarrollador("Julian1","nivel 3");
        Desarrollador desarrollador2=new Desarrollador("Julian2","nivel 10");
        Desarrollador desarrollador3 =new Desarrollador("Julian3","nivel 4");
        comunicador.attach(desarrollador1);
        comunicador.attach(desarrollador2);
        comunicador.attach(desarrollador3);
        Git git= new Git(comunicador);
        Codigo codigo;

        codigo= new Codigo("codigo1",true);
        git.setState(codigo);
        github.createCommit("6LUY789",git.createVersion());

        codigo= new Codigo("codigo2",false);
        git.setState(codigo);
        github.createCommit("7TYU201",git.createVersion());

        codigo= new Codigo("codigo3",false);
        git.setState(codigo);
        github.createCommit("5TCF001",git.createVersion());

        codigo= new Codigo("codigo4",false);
        git.setState(codigo);
        github.createCommit("3MNL774",git.createVersion());

        codigo= new Codigo("codigo5",false);
        git.setState(codigo);
        github.createCommit("4ELF147",git.createVersion());

        git.restoreFromMemento(github.getMemento("6LUY789"));


        comunicador.deattach(desarrollador1);
        comunicador.deattach(desarrollador2);
        comunicador.deattach(desarrollador3);
        Desarrollador desarrollador4 = new Desarrollador("Julian4","nivel 2");
        Desarrollador desarrollador5= new Desarrollador("Julian5","nivel 7");
        Desarrollador desarrollador6= new Desarrollador("Julian6","nivel 5");
        comunicador.attach(desarrollador4);
        comunicador.attach(desarrollador5);
        comunicador.attach(desarrollador6);
        git.restoreFromMemento(github.getMemento("4ELF147"));
    }
}
