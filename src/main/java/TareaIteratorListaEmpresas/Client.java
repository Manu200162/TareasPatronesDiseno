package TareaIteratorListaEmpresas;

import java.util.HashMap;

public class Client {

    public static void main(String[]args){

        HashMap<Integer,String> hm= new HashMap<Integer, String>();
        int contador =1;

        PrimeraCom p1=new PrimeraCom();
        p1.add("Jose1");
        p1.add("Jose2");
        p1.add("Jose3");
        p1.add("Jose4");
        p1.add("Jose5");

        SegundaCom s2=new SegundaCom();
        s2.add("Pedro1");
        s2.add("Pedro2");
        s2.add("Pedro3");
        s2.add("Pedro4");
        s2.add("Pedro5");

        TerceraCom t3= new TerceraCom();
        t3.add("Juan1");
        t3.add("Juan2");
        t3.add("Juan3");
        t3.add("Juan4");
        t3.add("Juan5");

        CuartaCom c4= new CuartaCom();
        c4.add("Maria1");
        c4.add("Maria2");
        c4.add("Maria3");
        c4.add("Maria4");
        c4.add("Maria5");

        Iterator iterator=p1.iterator();
        while(iterator.hasNext()){
            hm.put(contador++, iterator.next());
        }
        iterator=s2.iterator();
        while(iterator.hasNext()){
            hm.put(contador++, iterator.next());
        }
        iterator=t3.iterator();
        while(iterator.hasNext()){
            hm.put(contador++, iterator.next());
        }
        iterator=c4.iterator();
        while(iterator.hasNext()){
            hm.put(contador++, iterator.next());
        }
        for (Integer key: hm.keySet()){
            System.out.println(key+ " = " + hm.get(key));
        }

    }
}
