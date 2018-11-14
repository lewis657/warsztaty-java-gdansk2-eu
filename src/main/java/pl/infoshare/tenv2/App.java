package pl.infoshare.tenv2;


import pl.infoshare.tenv2.zad1.Kot;
import pl.infoshare.tenv2.zad1.MojaLista;
import pl.infoshare.tenv2.zad1.Pies;
import pl.infoshare.tenv2.zad1.Zwierze;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){


        //ZAD1
        Zwierze kot = new Kot();
        Zwierze pies = new Pies();

        System.out.println("Kot: " + kot.dajGlos());
        System.out.println("Pies: " + pies.dajGlos());

        Zwierze rybka = new Zwierze() {
            @Override
            public String dajGlos() {
                return "rybka";
            }
        };

        System.out.println(rybka.dajGlos());




        List lista = new MojaLista();

            for (int i=0; i<10; i++) {
                lista.add(i);
            }


        System.out.println(lista.get(2));
        System.out.println(lista);
    }


   }
