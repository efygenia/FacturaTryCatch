package test;

import entidades.Factura;
import java.util.ArrayList;

public class TestFacturas {

    public static void main(String[] args) {
        System.out.println("[....]");
        ArrayList<Factura> listado = new ArrayList();
        Factura miFactu1 = new Factura("Churro", 10);
        Factura miFactu2 = new Factura("Bola de Fraile", 25);
        Factura miFactu3 = new Factura("Medialuna", 15);
        listado.add(miFactu1);
        listado.add(miFactu2);
        listado.add(miFactu3);

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(listado.get(i).getNombre());

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Aprende a programar!!!" + e.getMessage());

        }

        System.out.println("[OK]");

    }

}
