package zad5_7;

import java.util.Set;
import java.util.TreeSet;

public class Glavna {
    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet<String> ();
        mnozestvo1.add("Palto");
        mnozestvo1.add("Bluza");
        mnozestvo1.add("Farmerki");

        Set<String> mnozestvo2 = new TreeSet<String> ();
        mnozestvo2.add("Farmerki");
        mnozestvo2.add("Bluza");
        mnozestvo2.add("Kosula");

        System.out.println("Presekot od dvete mnozestva e: ");
        mnozestvo1.retainAll(mnozestvo2);
        System.out.println(mnozestvo1);

        System.out.println("Unijata od dvete mnozestva e: ");
        mnozestvo1.addAll(mnozestvo2);
        System.out.println(mnozestvo1);
    }
}
