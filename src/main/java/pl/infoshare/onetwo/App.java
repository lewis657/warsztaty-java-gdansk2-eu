package pl.infoshare.onetwo;


import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*
            RZUTOWANIE
         */
        double a = 90.99;
        System.out.println(a);

        int b = (int) a;
        System.out.println(b);

        char c = 'a';
        System.out.println(c);

        int d = (int) c;
        System.out.println(d);

        System.out.println(b/a + d + "Wynik to: " + ("ZZZZ" + b + a + d));


        /*
            ----------------------------------------------------------------
         */
        /*
            INSTRUKCJA WARUNKOWA
         */

        byte age = 18;

        if(age >= 20 && age <= 30) {
            System.out.println("Wiek jest wiekszy rowny 20 lat i mniejszy rowny 30.");
        }

        if(age == 26 || age == 28) {
            System.out.println("Wiek jest rowny 26 lat lub 28.");
        } else if (age == 25){
            System.out.println("Wiek jest rowny 25 lat");
        } else {
            System.out.println("Jestes po prostu stary");
        }


        /*
            INSTRUKCJA WARUNKOWA - SWITCH
         */
        int agePrim = 22;

        switch (agePrim) {
            case 20: {
                System.out.println("Wiek jest rowny 20.");
                break;
            }

            case 22: {
                System.out.println("A");
            }
            case 23: {
                System.out.println("B");
            }
            case 24: {}
            case 25: {}
            case 26: {}
            case 27: {
                System.out.println("Wiek inny");
                break;
            }

            case 30: {
                System.out.println("Wiek jest rowny 30.");
                break;
            }

            default: {
                System.out.println("Po prostu jestes stary.");
            }
        }

        /*
            INSTRUKCJA WARUNKOWA SKROCONA
         */

        short ageBis = 15;
        System.out.println("Wiek wiekszy od 18? : " + (ageBis > 18 ? "TAK" : "NIE"));

         /*
            WCZYTYWANIE Z KLAWIATURY
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoj wiek: ");

        String ageFromKeyboard = scanner.nextLine();

        System.out.println("Podales: " + ageFromKeyboard);
    }


}
