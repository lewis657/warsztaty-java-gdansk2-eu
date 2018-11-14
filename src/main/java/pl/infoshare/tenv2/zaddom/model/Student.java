package pl.infoshare.tenv2.zaddom.model;

import java.time.LocalDate;

public class Student extends Osoba {
   private int index;

    public Student(LocalDate rok, char plec, int index) {
        super(rok, plec);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
