package pl.infoshare.tenv2.zaddom.model;

import java.time.LocalDate;

public class Wykladowca extends Osoba {
    String tytul;


    public Wykladowca(String imie, String nazwisko, LocalDate rok, char plec) {
        super(rok, plec);
    }
}
