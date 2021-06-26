package TareaEjercicios3erParcial.ejercicio2Bridge;

public class Client {
    public static void main(String[] args){
        IEmpresa empresaElectrica= new InstalacionElectrica(new TigoMoney());
        empresaElectrica.pagar(empresaElectrica.getPrecio());

        IEmpresa empresaAgua= new InstalacionDeAgua(new AplicacionEmpresa());
        empresaAgua.pagar(empresaAgua.getPrecio());

        IEmpresa empresaAlcantarillado= new InstalacionAlcantarillado(new TransferenciaBancaria());
        empresaAlcantarillado.pagar(empresaAlcantarillado.getPrecio());

        IEmpresa empresaAgua2= new InstalacionDeAgua(new TigoMoney());
        empresaAgua2.pagar(empresaAgua2.getPrecio());
    }
}
