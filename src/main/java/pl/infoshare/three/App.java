package pl.infoshare.three;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[][] array2D = new int[10][10];

        for (int i = 0; i < array2D.length; i++) {
            System.out.println("I'm in row no. " + i);
            for (int j = 0; j < array2D.length; j++) {
                System.out.println("I'm in column no. " + j);
            }
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //1. 2. 3. ...
        for (int i = 1; i < array2D.length + 1 ; i++ ){
            System.out.print(i + ". ");

            //1 2 3 4 5 6 7 8 9 10
            for (int j = 1 ; j < array2D.length + 1 ; j++){
                System.out.print(j + " ");
            }
            System.out.println(); //Next line
        }


        /*
            CHRISTMAS TREE
         */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }

        int[][] array2DFor = new int[10][10];

        //Pierwsza petla "lata po wierszach"
        for (int i = 0; i < array2DFor.length; i++) {
            //Druga petla "lata" po kolumnach
            for (int j = 0; j < array2DFor.length; j++) {
                //i - numer wiersza
                //j - numer kolumny
                array2DFor[i][j] = j + 1;
            }
        }

        //Pierwsza petla "lata po wierszach"
        for (int[] oneDimArray : array2DFor) {
            //Druga petla "lata" po kolumnach
            for (int singleElem : oneDimArray) {
                System.out.print(singleElem + " ");
            }
            System.out.println();
        }


        /*
        ZADANIE 1
         */

        int[] array = new int[11];

        //Losowanie dowolnej liczby int w przedziale 1 do 100
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;

        for (int i = 0; i < array.length ; i++){
            array[i] = random.nextInt(100) + 1;
        }

        for(int i = 0 ; i < array.length ; i++){
            if(i % 2 != 0) System.out.println("Index no. " + i + "\t\t\t\t\t\t\t\tvalue: " + array[i]);
        }

        /*
        ZADANIE 2
         */

        char[][] array2DTask = new char[10][10];

        //Pierwsza petla "lata po wierszach"
        for (int i = 0; i < array2DTask.length; i++) {
            //Druga petla "lata" po kolumnach
            for (int j = 0; j < array2DTask.length; j++) {
                //i - numer wiersza
                //j - numer kolumny
                array2DTask[i][j] = '*';
            }
        }

        for(int i = 0 ; i < array2DTask.length ; i++){
            for (int j = 0 ; j < array2DTask.length ; j++){
                if(i % 2 == 0) System.out.print(array2DTask[i][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }

         /*
        ZADANIE 3
         */
         int winningNumber = new Random().nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Podaj liczbe od 1 do 10: ");
            int userNumber = scanner.nextInt();

            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Podales liczbe z innego przedzialu!!");
            }

            if (userNumber == winningNumber) {
                System.out.println("WYGRALES!");
                break;
            }
            else System.out.println("GRAJ DALEJ :-(");
        }
    }


}
