package zad2_6;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
        public static void main(String[] args) {
            List<String> lista = new ArrayList<String>();
            lista.add("Makedonija");
            lista.add("Bugarija");
            lista.add("Ungarija");
            lista.add("Portugalija");
            lista.add("Turcija");

            System.out.println("Dadenata listata sodrzi "+ lista.size()+" elementi.");

            if(lista.size() == 3) {
                lista.add("Spanija");
                lista.add("Germanija");

                System.out.println(lista);
            }
            else {
                System.out.println(lista);
            }
        }
    }