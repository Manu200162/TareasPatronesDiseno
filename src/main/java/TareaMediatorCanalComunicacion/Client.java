package TareaMediatorCanalComunicacion;

public class Client {

    public static void main(String[]args){

        SKYPE skype = new SKYPE();

        QA qa1= new QA(skype);
        QA qa2 = new QA(skype);
        QA qa3 = new QA(skype);
        qa1.setCi("000111");
        qa1.setNombre("Juan Perez");
        qa1.setGrado("Grado 2");
        qa2.setCi("000112");
        qa2.setNombre("Leonardo Prieto");
        qa2.setGrado("Grado 1");
        qa3.setCi("000113");
        qa3.setNombre("Jose Mendez");
        qa3.setGrado("Grado 4");

        DEV dev1= new DEV(skype);
        DEV dev2= new DEV(skype);
        DEV dev3= new DEV(skype);
        dev1.setCi("111111");
        dev1.setNombre("Ana Camargo");
        dev1.setLenguaje("Ingles");
        dev2.setCi("111112");
        dev2.setNombre("Manuel Alvarado");
        dev2.setLenguaje("Español");
        dev3.setCi("111113");
        dev3.setNombre("Andre Navajas");
        dev3.setLenguaje("Ingles");

        SM sm1 = new SM(skype);
        SM sm2 = new SM(skype);
        SM sm3 = new SM(skype);
        sm1.setCi("222111");
        sm1.setNombre("Jhon Sanchez");
        sm1.setCertificaciones("4 certificaciones");
        sm2.setCi("222112");
        sm2.setNombre("Pedro Diaz");
        sm2.setCertificaciones("3 certificaciones");
        sm3.setCi("222113");
        sm3.setNombre("Elian Enrriquez");
        sm3.setCertificaciones("2 certificaciones");

        skype.addPersonaChat(qa1);
        skype.addPersonaChat(qa2);
        skype.addPersonaChat(qa3);
        skype.addPersonaChat(dev1);
        skype.addPersonaChat(dev2);
        skype.addPersonaChat(dev3);
        skype.addPersonaChat(sm1);
        skype.addPersonaChat(sm2);
        skype.addPersonaChat(sm3);

        dev1.send("Saludo a todos los DEVs");


        qa2.send("Como estan QAs, mañana a trabajar con todo");

        sm1.send("Hoy acaba el sprint asi que les pido de su esfuerzo");



    }
}
