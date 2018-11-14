package pl.infoshare.tenv2.zaddom.model;

import java.time.LocalDate;

public class Osoba {
    String imie;
    String nazwisko;
    LocalDate rok;
    char plec;


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getRok() {
        return rok;
    }

    public char getPlec() {
        return plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Osoba(LocalDate rok, char plec) {
        this.rok = rok;
        this.plec = plec;
    }
}
