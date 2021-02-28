package uaslp.ingenieria.labs;

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

        for(int i=0; i < lista1.getSize(); i++){
            System.out.println("El dato de la posición " + i + " es:" + lista1.get(i));
        }

        System.out.println("-----------------------");

        lista1.delete(1);

        for(int i=0; i < lista1.getSize(); i++){
            System.out.println("El dato de la posición " + i + " es:" + lista1.get(i));
        }

        System.out.println("-----------------------");

        lista1.delete(0);

        for(int i=0; i < lista1.getSize(); i++){
            System.out.println("El dato de la posición " + i + " es:" + lista1.get(i));
        }

        System.out.println("-----------------------");

        lista1.delete(lista1.getSize() - 1);

        for(int i=0; i < lista1.getSize(); i++){
            System.out.println("El dato de la posición " + i + " es:" + lista1.get(i));
        }

        System.out.println("-----------------------");

        lista1.delete(0);

        for(int i=0; i < lista1.getSize(); i++){
            System.out.println("El dato de la posición " + i + " es:" + lista1.get(i));
        }

        System.out.println("El tamaño de la lista es:" + lista1.getSize());
    }
}
