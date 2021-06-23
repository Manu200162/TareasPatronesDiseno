package TareaBridge.ejercicio2;

public class Client {

    public static void main(String[] args){

        IEmpresa empresa1= new  EmpresaSRL(new EnvioAire());
        empresa1.enviar(new Paquete("Televior 80 pulgadas",1000));

        IEmpresa empresa2= new EmpresaSA(new EnvioMar());
        empresa2.enviar(new Paquete("Celular ultima generacion",500));

        IEmpresa empresa3 = new EmpresaSRL(new EnvioTierra());
        empresa3.enviar(new Paquete("Computadora gamer",980));

    }
}
