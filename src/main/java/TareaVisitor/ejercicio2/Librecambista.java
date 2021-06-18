package TareaVisitor.ejercicio2;

import java.text.DecimalFormat;

public class Librecambista implements IVisitante {

    @Override
    public void visit(Bolivia bolivia, Boolean cambioADolares,int monto) {
        System.out.println("El pais donde esta el librecambista es Bolivia: ");
        if(cambioADolares){
            System.out.println("Se cambiara de: "+bolivia.getTipoModena()+" a Dolares");
        }else{
            System.out.println("Se cambiara de Dolares a: "+bolivia.getTipoModena());
        }
        hacerCambioMoneda(cambioADolares,bolivia,monto);
    }

    @Override
    public void visit(Argentina argentina, Boolean cambioADolares, int monto) {
        System.out.println("El pais donde esta el librecambista es Argentina: ");
        if(cambioADolares){
            System.out.println("Se cambiara de: "+argentina.getTipoModena()+" a Dolares");
        }else{
            System.out.println("Se cambiara de Dolares a: "+argentina.getTipoModena());
        }
        hacerCambioMoneda(cambioADolares,argentina, monto);
    }

    @Override
    public void visit(Brasil brasil, Boolean cambioADolares,int monto) {
        System.out.println("El pais donde esta el librecambista es Brasil: ");
        if(cambioADolares){
            System.out.println("Se cambiara de: "+brasil.getTipoModena()+" a Dolares");
        }else{
            System.out.println("Se cambiara de Dolares a: "+brasil.getTipoModena());
        }
        hacerCambioMoneda(cambioADolares,brasil,monto);
    }

    @Override
    public void visit(Italia italia, Boolean cambioADolares, int monto) {
        System.out.println("El pais donde esta el librecambista es Italia: ");
        if(cambioADolares){
            System.out.println("Se cambiara de: "+italia.getTipoModena()+" a Dolares");
        }else{
            System.out.println("Se cambiara de Dolares a: "+italia.getTipoModena());
        }
        hacerCambioMoneda(cambioADolares,italia,monto);
    }

    @Override
    public void hacerCambioMoneda(Boolean cambioADolares, IPais pais, int monto) {
        double montoDeCambio;
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        frmt.setMinimumFractionDigits(2);
        if(pais instanceof Bolivia){
            if(cambioADolares){
                montoDeCambio=monto/((Bolivia) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Bolivianos a Dolares es: "+frmt.format(montoDeCambio)+
                        " Dolares");
            }else{
                montoDeCambio=monto*((Bolivia) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Dolares a "+((Bolivia) pais).getTipoModena()+
                        " es: "+frmt.format(montoDeCambio)+" Bolivianos");
            }
        }else if(pais instanceof Argentina){
            if(cambioADolares){
                montoDeCambio=monto/((Argentina) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Pesos Argentinos a Dolares es: "+frmt.format(montoDeCambio)+
                        " Dolares");
            }else{
                montoDeCambio=monto*((Argentina) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Dolares a "+((Argentina) pais).getTipoModena()+
                        " es: "+frmt.format(montoDeCambio)+" Pesos Argentinos");
            }
        }else if(pais instanceof Brasil){
            if(cambioADolares){
                montoDeCambio=monto/((Brasil) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Reales a Dolares es: "+frmt.format(montoDeCambio)+
                        " Dolares");
            }else{
                montoDeCambio=monto*((Brasil) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Dolares a "+((Brasil) pais).getTipoModena()+
                        " es: "+frmt.format(montoDeCambio)+ " Reales");
            }
        }else if(pais instanceof Italia){
            if(cambioADolares){
                montoDeCambio=monto/((Italia) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Euros a Dolares es: "+frmt.format(montoDeCambio)+
                        " Dolares");
            }else{
                montoDeCambio=monto*((Italia) pais).getCambioAdolares();
                System.out.println("INFO> El cambio de: "+monto+" Dolares a "+((Italia) pais).getTipoModena()+
                        " es: "+frmt.format(montoDeCambio)+" Euros");
            }
        }
    }
}
