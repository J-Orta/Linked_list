package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.ArrayList;
import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<Double> lista3 = new ArrayList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        lista3.add(1.1);
        lista3.add(4.4);
        lista3.add(3.3);
        lista3.add(7.7);

        lista2.add(" hola");
        lista2.add(" Object ");
        lista2.add(" Oriented ");
        lista2.add(" Programming ");

        lista1.delete(1);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        Iterator<Integer> it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        lista3.delete(1);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista3.getSize());

        Iterator<Double> itD = lista3.getIterator();

        while(itD.hasNext()){
            double element = itD.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        Iterator<Integer> reverseIterator = lista1.getReverseIterator();

        while(reverseIterator.hasNext()){
            int element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        Iterator<Double> reverseIteratorDouble = lista3.getReverseIterator();

        while(reverseIteratorDouble.hasNext()){
            double element = reverseIteratorDouble.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        Iterator<String> itStrings = lista2.getIterator();

        while(itStrings.hasNext()) {
            System.out.println(itStrings.next());
        }

        System.out.println("---------------------");
        System.out.println("Get with index = 3");

        System.out.println(lista1.get(3));
        System.out.println(lista3.get(3));
        System.out.println(lista2.get(3));

    }
}

