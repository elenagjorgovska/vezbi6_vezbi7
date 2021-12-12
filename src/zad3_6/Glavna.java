package zad3_6;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("INKI");
        lista.add("IKT");
        lista.add("KNI");
            System.out.println("Elementi na listata pred promeni :");
        System.out.println(lista);

        lista.add(2, "IMB");
        System.out.println("Elementi na listata posle napravena promena (dodavanje na uste eden element na treta pozicija vo lista) :");
        System.out.println(lista);
    }
}

