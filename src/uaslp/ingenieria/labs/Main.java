package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.LinkedList;

public class Main {

    public static void main (String[] arqs){

        LinkedList lista1 = new LinkedList();

        lista1.add(5);
        lista1.add(9);
        lista1.add(6);
        lista1.add(4);

        System.out.println("El tamaño de la lista es:" + lista1.getSize());
        System.out.println("----");

        Iterator it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }
    }
}
