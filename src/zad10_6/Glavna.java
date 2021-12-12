package zad10_6;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Hamburger");
        l1.add("Pizza");
        l1.add("Tost");
        List<String> l2 = new ArrayList<String>();
        l2.add("Sladoled");
        l2.add("Torta");
        l2.add("Palacinka");

        l1.addAll(l2);

        System.out.println(l1);
    }
}
