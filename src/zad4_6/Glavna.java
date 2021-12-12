package zad4_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(50);
        lista.add(100);
        lista.add(17);
        lista.add(4);
        lista.add(1345);

        Collections.sort(lista);

        System.out.println(lista);
    }
}
