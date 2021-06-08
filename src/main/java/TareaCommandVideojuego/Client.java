package TareaCommandVideojuego;

public class Client {

    public static void main(String[] args){
        Videojuego videojuego = new Videojuego("jose2034","nivel 5",3,56);

        Disparos disparos =new Disparos(videojuego);
        ModoDefensa modoDefensa = new ModoDefensa(videojuego);
        Ataque ataque = new Ataque(videojuego);

        Invoker makeGame = new Invoker();
        makeGame.addAction(disparos);
        makeGame.addAction(ataque);
        makeGame.addAction(disparos);
        makeGame.addAction(modoDefensa);
        makeGame.addAction(ataque);

        System.out.println("**********************************");
        makeGame.executeCommands();
        System.out.println("**********************************");


        Videojuego videojuego2 = new Videojuego("juan456","nivel 20",2,30);

        Disparos disparos2 =new Disparos(videojuego2);
        ModoDefensa modoDefensa2 = new ModoDefensa(videojuego2);
        Ataque ataque2 = new Ataque(videojuego2);

        Invoker makeGame2 = new Invoker();

        makeGame2.addAction(disparos2);
        makeGame2.addAction(ataque2);
        makeGame2.addAction(disparos2);
        makeGame2.addAction(disparos2);
        makeGame2.addAction(modoDefensa2);
        makeGame2.addAction(ataque2);

        System.out.println("**********************************");
        makeGame2.executeCommands();
        System.out.println("**********************************");



    }



}
