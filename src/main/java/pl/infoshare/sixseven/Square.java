package pl.infoshare.sixseven;

public class Square {

    int sideLength = 5;

    public int calculateField(){
        return sideLength * sideLength;
    }

    public double calculateDiagonal(){
        return sideLength * Math.sqrt(2.0);
    }


}
