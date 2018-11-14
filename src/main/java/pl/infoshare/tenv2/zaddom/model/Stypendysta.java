package pl.infoshare.tenv2.zaddom.model;

import java.time.LocalDate;

public class Stypendysta extends Student {

    double hajsy;

    public Stypendysta(LocalDate rok, char plec,int index,double hajsy) {
        super(rok, plec,index);
        this.hajsy = hajsy;

    }

    public double getHajsy() {
        return hajsy;
    }

    public void setHajsy(double hajsy) {
        this.hajsy = hajsy;
    }
}
