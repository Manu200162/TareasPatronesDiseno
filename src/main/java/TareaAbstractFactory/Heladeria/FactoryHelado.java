package TareaAbstractFactory.Heladeria;

public class FactoryHelado {

    public enum typeHelado{
        HELADO_AGUA,HELADO_CREMA,HELADO_MIXTO
    }

    public static IHelado make(typeHelado type){
        IHelado helado;
        switch(type){
            case HELADO_AGUA:
                helado= new HeladoAgua();
                ((HeladoAgua) helado).setTamano("Mediano");
                ((HeladoAgua) helado).setForma(" Tradicional");
                ((HeladoAgua) helado).setBase(new Base());
                ((HeladoAgua) helado).setFruta(new Fruta());
                break;
            case HELADO_CREMA:
                helado=new HeladoCrema();
                ((HeladoCrema) helado).setTamano("Pequeño");
                ((HeladoCrema) helado).setForma("Tradicional");
                ((HeladoCrema) helado).setBase(new Base());
                ((HeladoCrema) helado).setCrema(new Crema());
                ((HeladoCrema) helado).setFruta(new Fruta());
                break;
            case HELADO_MIXTO:
                helado= new HeladoMixto();
                ((HeladoMixto) helado).setTamano("Mediano");
                ((HeladoMixto) helado).setForma("Tradicional");
                ((HeladoMixto) helado).setBase(new Base());
                ((HeladoMixto) helado).setCrema(new Crema());
                ((HeladoMixto) helado).setFruta(new Fruta());
                ((HeladoMixto) helado).setCosto("20 bs");
                break;
            default:
                helado= new HeladoAgua();
                break;
        }

     return helado;
    }
}
