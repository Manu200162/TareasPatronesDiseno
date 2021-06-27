package TareaEjercicios3erParcial.ejercicio7Extra;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private static CuentaBancaria instancia;
    private static List<IDueno> duenoList;
    private int saldo;

    private CuentaBancaria(){
        System.out.println("Se instancia la cuenta bancaria***********************");
        this.duenoList= new ArrayList<>();
        this.saldo=0;
    }

    public synchronized void attachDueno(IDueno dueno){
            duenoList.add(dueno);
    }

    public static synchronized void makeInstance(){
        if(instancia==null){
            instancia=new CuentaBancaria();
        }
    }

    public static synchronized CuentaBancaria getInstance(){
        if(instancia==null){
            makeInstance();
        }
        return instancia;
    }

    public synchronized void recibirPago (int monto, String nombre){
        saldo=saldo+monto;
        System.out.println("Se recibio el pago por el servicio recibido, el saldo de la cuenta es: "+saldo+" Bolivianos");
        mandarNotificacion(monto);
    }
    public synchronized void mandarNotificacion(int monto){
        System.out.println("--------------------------------------------------------------");
        for(IDueno dueno: duenoList){
            if(dueno.getpuesto().equals("Presidente") || dueno.getpuesto().equals("VicePresidente")||
                        dueno.getpuesto().equals("Contabilidad")){
                        dueno.notificar("La cuenta recibio el monto de: "+monto+" Bolivianos");
                }
            }
        System.out.println("--------------------------------------------------------------");
    }
}
