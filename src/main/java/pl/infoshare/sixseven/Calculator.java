package pl.infoshare.sixseven;

public class Calculator {

    public int someField = 5;

    public double add(double a, double b){
        System.out.println("ADD z typem double");
        return a + b;
    }
    public int add(int a, int b){
        System.out.println("ADD z typem int");
        return a + b;
    }

    public double multiply(double a, double b){
        return a * b;
    }
    public double multiply(double a, int b, String z){
        return a * a;
    }

    public double substract(double a, double b){
        return a - b;
    }
    public double divide(double a, double b){
        if(b == 0) return 0;
        return a / b;
    }


}
