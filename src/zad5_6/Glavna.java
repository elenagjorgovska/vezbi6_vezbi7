package zad5_6;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(41);
        lista.add(76);
        lista.add(234);
        lista.add(90);

        System.out.println("Se pecati vtoriot element od zadadenata lista: "+lista.get(1));
    }
}
