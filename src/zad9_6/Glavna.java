package zad9_6;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

    public static void main(String[] args) {
        List<Fakultet> lista = new ArrayList<Fakultet>();

        Fakultet f =  new Fakultet("FIKT",3,900);
        lista.add(f);
        lista.add(new Fakultet("FINKI", 10, 1000));
        lista.add(new Fakultet("FEIT", 8, 1200));
        lista.add(new Fakultet("TFB", 7, 1100));
        lista.add(new Fakultet("PMF", 6, 700));

        for(int i=0;i<lista.size();i++){
        System.out.println(lista.get(i).getIme());
        System.out.println(lista.get(i).getBrojNaSmerovi());
        System.out.println(lista.get(i).getVkupnoStudenti());
        }
    }
}