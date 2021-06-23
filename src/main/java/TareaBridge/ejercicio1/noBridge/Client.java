package TareaBridge.ejercicio1.noBridge;

public class Client {
    public static void main(String [] args){

        Windows7x64 windows7x64 = new Windows7x64();
        windows7x64.showArquitectura();
        Windows7x86 windows7x86 = new Windows7x86();
        windows7x86.showArquitectura();

        Linuxx64 linuxx64 = new Linuxx64();
        linuxx64.showArquitectura();

        Linuxx86 linuxx86 = new Linuxx86();
        linuxx86.showArquitectura();
    }
}
