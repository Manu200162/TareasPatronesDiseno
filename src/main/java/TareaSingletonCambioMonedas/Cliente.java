package TareaSingletonCambioMonedas;

public class Cliente {
    public static void main(String args[]){

        Moneda bolivianos = new Moneda();
        bolivianos.setNombre("Bolivianos");
        bolivianos.setValorEnDolares(0.15);
        bolivianos.setSimbolo("Bs.");

        Moneda dolares = new Moneda();
        dolares.setNombre("Dolares");
        dolares.setValorEnDolares(1);
        dolares.setSimbolo("$");

        Moneda euros = new Moneda();
        euros.setNombre("Euros");
        euros.setValorEnDolares(1.22);
        euros.setSimbolo("€");

        Thread juan = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco= new Banco();
                banco.cambio(200,bolivianos,"Dolares");
            }
        });
        Thread ana = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambistas libre= new LibreCambistas();
                libre.cambio(200,euros,"Bolivianos");
            }
        });

        Thread pedro = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaDeCambios casa= new CasaDeCambios();
                casa.cambio(200,dolares,"Euros");
            }
        });
       juan.start();
       ana.start();
       pedro.start();
    }


}
