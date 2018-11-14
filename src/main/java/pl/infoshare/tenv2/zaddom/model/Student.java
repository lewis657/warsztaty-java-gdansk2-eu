package pl.infoshare.tenv2.zaddom.model;

import java.time.LocalDate;

public class Student extends Osoba {
    int index;

    public Student(LocalDate rok, char plec) {
        super(rok, plec);
    }
}
