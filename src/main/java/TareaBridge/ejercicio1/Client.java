package TareaBridge.ejercicio1;

public class Client {
    public static void main(String [] args){
        IPlataforma windows = new Windows(new Arquitecturax86());
        windows.informacion();
        windows.SetArquitectura();

        IPlataforma windows2= new Windows(new Arquitecturax64());
        windows2.informacion();
        windows2.SetArquitectura();

        IPlataforma Linux = new Linux(new Arquitecturax86());
        Linux.informacion();
        Linux.SetArquitectura();

        IPlataforma Linux2= new Linux(new Arquitecturax64());
        Linux2.informacion();
        Linux2.SetArquitectura();
    }
}
