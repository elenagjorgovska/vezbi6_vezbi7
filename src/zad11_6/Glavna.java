package zad11_6;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {

        List<String> l1 =  new ArrayList<String>();
        l1.add("Moliv");
        l1.add("Penkalo");
        l1.add("Tetratka");

        List<String> l2 = new ArrayList<String>();
        l2.add("Korektor");
        l2.add("Ostrilka");
        l2.add("Tetratka");

        l1.retainAll(l2);

        System.out.println(l1);
    }
}
