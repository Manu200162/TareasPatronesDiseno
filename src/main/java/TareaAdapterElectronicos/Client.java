package TareaAdapterElectronicos;

public class Client {
    public static void main(String[] args){

        //Celular
        Celulares celular = new Celulares();
        celular.setModelo("Samsung s20");
        celular.setPrecio(500);
        celular.setTiempoVida(5);
        //Tablet
        Tablets tablet = new Tablets();
        tablet.setModelo("Ipad pro");
        tablet.setPrecio(900);
        tablet.setTiempoVida(6);
        //Computadora
        Computadoras computadora = new Computadoras();
        computadora.setModelo("Macbook air");
        computadora.setPrecio(1500);
        computadora.setTiempoVida(6);
        //LavadoraAdaptada
        Lavadoras lavadoras = new Lavadoras();
        lavadoras.setMarca("Samsung");
        LavadoraAdaptada lavadoraAdaptada = new LavadoraAdaptada(lavadoras);
        lavadoraAdaptada.setPrecio(600);
        lavadoraAdaptada.setTiempoVida(4);
        //TelevisorAdaptado
        Televisores televisores = new Televisores();
        televisores.setMarca("Sony");
        TelevisorAdaptado televisorAdaptado = new TelevisorAdaptado(televisores);
        televisorAdaptado.setPrecio(1000);
        televisorAdaptado.setTiempoVida(5);
        //RefrigeradorAdaptado
        Refrigeradores refrigerador = new Refrigeradores();
        refrigerador.setMarca("Lg");
        RefrigeradorAdaptado refrigeradorAdaptado = new RefrigeradorAdaptado(refrigerador);
        refrigeradorAdaptado.setPrecio(2000);
        refrigeradorAdaptado.setTiempoVida(10);

        System.out.println("***********************************************");
        tablet.getPrecio();
        tablet.getTiempoVida();
        System.out.println("***********************************************");
        lavadoraAdaptada.getPrecio();
        lavadoraAdaptada.getTiempoVida();
        System.out.println("***********************************************");
        celular.getPrecio();
        celular.getTiempoVida();
        System.out.println("***********************************************");
        televisorAdaptado.getPrecio();
        televisorAdaptado.getTiempoVida();



    }






}
