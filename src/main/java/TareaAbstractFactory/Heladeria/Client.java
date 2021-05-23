package TareaAbstractFactory.Heladeria;

public class Client {
    public static void main (String[] args){
        HeladoAgua ha1= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        ha1.setBase(new Base("Paleta de madera","pequeño","paleta","0.20 cents."));
        ha1.setFruta(new Fruta("citrico","naranja","1 Bs","mediano"));
        ha1.crear();

        HeladoAgua ha2= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        ha2.setBase(new Base("Vaso de helado","Grande","Vaso","0.40 cents."));
        ha2.setFruta(new Fruta("citrico","limon","1 Bs","pequeño"));
        ha2.crear();

        HeladoCrema hc1= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        hc1.setBase(new Base("Galleta","Mediano","galleta comestible","0.80 cents."));
        hc1.setFruta(new Fruta("normal","platano","1 Bs","mediano"));
        hc1.setCrema(new Crema("Vainilla","20 cent.","Pil"));
        hc1.crear();

        HeladoCrema hc2= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        hc2.setBase(new Base("Galleta","Mediano","galleta comestible","0.80 cents."));
        hc2.setFruta(new Fruta("normal","platano","2 Bs","mediano"));
        hc2.setCrema(new Crema("Chocolate","90 cent.","Delicia"));
        hc2.crear();

        HeladoMixto hx1= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        hx1.setBase(new Base("Paleta de madera","Grande","paleta","0.20 cents."));
        hx1.setFruta(new Fruta("normal","naranja","2 Bs","mediano"));
        hx1.setCrema(new Crema("Cherry","80 cent.","PIL"));
        hx1.crear();

        HeladoMixto hx2= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        hx2.setBase(new Base("Galleta","Mediano","galleta comestible","0.80 cents."));
        hx2.setFruta(new Fruta("normal","limon","30 cent","pequeño"));
        hx2.setCrema(new Crema("Vainilla","50 cent.","Delicia"));
        hx2.crear();
    }


}
