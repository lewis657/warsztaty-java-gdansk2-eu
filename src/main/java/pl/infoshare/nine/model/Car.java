package pl.infoshare.nine.model;

import pl.infoshare.nine.impl.Fiat;
import pl.infoshare.nine.impl.Mercedes;

public class Car {

    int kola = 4 ;
    int szyby = 6;



    public Car() {


        System.out.println("Tworze klase Car");

    }

    public Car(int kola, int szyby) {
        this.kola = kola;
        this.szyby = szyby;
    }
}
