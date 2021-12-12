package zad1_7;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        lista.add("Paracetamol");
        lista.add("Analgin");
        lista.add("Benalfin");
        lista.add("Torvex");
        lista.add("Lorista H");

        if(lista.get(lista.size() - 1).equals("Paracetamol")){
            System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura.");
        }
        else
            System.out.println("Namenata na lekot e nepoznata!");
    }
}

