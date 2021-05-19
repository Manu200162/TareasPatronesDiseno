package TareaPrototypeCelulares;

public class Cliente {

    public static void main (String[] args){
        Celular celularBase = new Celular();
        celularBase.setNombreModelo("Samsung R10");
        celularBase.setCpu("Snapdragon 750G 5G");
        celularBase.setMemoriaInterna(" ");
        celularBase.setVersionAndroid(" ");
        celularBase.setCamara("64 Mpx");
        celularBase.setVersionBluetooth("Bluetooth 5.0");
        celularBase.setTamanoMemoriaExterna(" 1 TB");
        celularBase.setBateria("4.500 mAh + carga rápida 25 W");
        celularBase.setAccesorios("");
        celularBase.setSim(new SIM("",1));

       Celular celular1 =(Celular) celularBase.clone();
       celular1.setMemoriaInterna("128 GB");
       celular1.setVersionAndroid("Android 10");
       celular1.setAccesorios("Cargador, Audifonos, Estuche");
       celular1.setSim(new SIM("viva",75631025));

        Celular celular2 =(Celular) celularBase.clone();
        celular2.setMemoriaInterna("128 GB");
        celular2.setVersionAndroid("Android 10");
        celular2.setAccesorios("Cargador, Audifonos");
        celular2.setSim(new SIM("entel",75624025));

        Celular celular3 =(Celular) celularBase.clone();
        celular3.setMemoriaInterna("256 GB");
        celular3.setVersionAndroid("Android 11");
        celular3.setAccesorios("Audifonos, Estuche, parlante ");
        celular3.setSim(new SIM("tigo",73645123));

        celular1.mostrarCelulares();
        celular2.mostrarCelulares();
        celular3.mostrarCelulares();
    }



}
