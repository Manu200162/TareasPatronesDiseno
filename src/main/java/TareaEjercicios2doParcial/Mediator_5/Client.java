package TareaEjercicios2doParcial.Mediator_5;

public class Client {

    public static void main(String[] args ){

        Whatsapp whatsapp = new Whatsapp();
        Usuario usuario1= new Usuario(whatsapp);
        usuario1.setNombre("Juan1");
        usuario1.setCelularNumber("63459863");

        Usuario usuario2= new Usuario(whatsapp);
        usuario2.setNombre("Juan2");
        usuario2.setCelularNumber("78340264");

        Usuario usuario3= new Usuario(whatsapp);
        usuario3.setNombre("Juan3");
        usuario3.setCelularNumber("70023559");

        Usuario usuario4= new Usuario(whatsapp);
        usuario4.setNombre("Juan4");
        usuario4.setCelularNumber("63458900");

        Usuario usuario5= new Usuario(whatsapp);
        usuario5.setNombre("Juan5");
        usuario5.setCelularNumber("89103486");

        Usuario usuario6= new Usuario(whatsapp);
        usuario6.setNombre("Juan6");
        usuario6.setCelularNumber("30124587");

        Usuario usuario7= new Usuario(whatsapp);
        usuario7.setNombre("Juan7");
        usuario7.setCelularNumber("74123489");

        Usuario usuario8= new Usuario(whatsapp);
        usuario8.setNombre("Juan8");
        usuario8.setCelularNumber("50164897");

        Usuario usuario9= new Usuario(whatsapp);
        usuario9.setNombre("Juan9");
        usuario9.setCelularNumber("41031459");

        Usuario usuario10= new Usuario(whatsapp);
        usuario10.setNombre("Juan10");
        usuario10.setCelularNumber("41237782");

        whatsapp.agregarContacto(usuario1);
        whatsapp.agregarContacto(usuario2);
        whatsapp.agregarContacto(usuario3);
        whatsapp.agregarContacto(usuario4);
        whatsapp.agregarContacto(usuario5);
        whatsapp.agregarContacto(usuario6);
        whatsapp.agregarContacto(usuario7);
        whatsapp.agregarContacto(usuario8);
        whatsapp.agregarContacto(usuario9);
        whatsapp.agregarContacto(usuario10);

        usuario1.sendPersonal("Como anda todo?",2);
        usuario10.sendGrupal("Hola grupo, el sabado reunion en mi casa");


    }
}
