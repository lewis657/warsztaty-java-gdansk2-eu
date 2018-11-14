package pl.infoshare.tenv2.zaddom.model;

import java.time.LocalDate;

public class Wykladowca extends Osoba {
  private String tytul;


    public Wykladowca(String imie, String nazwisko, LocalDate rok, char plec, String tytul) {
        super(rok, plec);
        this.tytul=tytul;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}
