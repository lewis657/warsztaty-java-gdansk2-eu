package pl.infoshare.repeat1234;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws InterruptedException {
        /*
            RZUTOWANIE
         */
        byte a = 127;
        short b = a;
        int c =  b;
        long d = c;

        float e = d;
        double f = e;

        //----------------------------------------------------------
        double g = 10000000;
        float h = (float) g;

        long i = (long) h;
        int j = (int) i;
        short k = (short) j;
        byte l = (byte) k;

        System.out.println(a + " " +
                b + " " +
                c + " " +
                d + " " +
                e + " " +
                f + " " +
                g + " " +
                h + " " +
                i + " " +
                j + " " +
                k + " " +
                l);

        /*
         TABLICE WIELOWYMIAROWE
         */
        double[] tab1 = new double[5];

        double[][] tab2 = new double[5][5];

        /*
         SWITCH
         */
        String username = "admin";
//        if(username.equals("admin")) System.out.println("Witaj admin");

        switch(username) {
            case "admin1": {
                System.out.println("Siema");
            }
            case "admin2":
            case "admin" : {
                System.out.println(username);
                break;
            }

            default: {
                System.out.println("Nie jestes zadnym z adminow");
            }
        }

        for (int ix = 1 ; ix <= 10 ; ix++){
            switch (ix) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:{
                    System.out.println("Nieparzysta");
                    break;
                }
                default:
                    System.out.println("Parzysta");
            }
        }

        /*
         WRZUCANIE DO TABLICY
         */
        String[] imiona = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imie:");
        imiona[0] = sc.nextLine();

        for (String name : imiona) {
            System.out.println(name);
        }

        /*
            PETLE NIESKONCZONE
         */
        long startTime = System.currentTimeMillis();
        int id  = 1;
        while(true){
            if(id > 100){ break; }
            System.out.println(id);
            id++;
            Thread.sleep(10);
        }

        System.out.println("Time elapsed: " + ((System.currentTimeMillis() - startTime)/1000) + "s");

        /*
        OPERATORY LOGICZNE
         */

        boolean tr = true;
        boolean fa = false;

        if(one() && two()){
            System.out.println("TRUE");
        }
        
    }

    public static boolean one() {
        System.out.println("One");
        return true;
    }

    public static boolean two() {
        System.out.println("Two");
        return false;
    }
}
