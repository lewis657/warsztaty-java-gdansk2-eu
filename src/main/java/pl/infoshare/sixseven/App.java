package pl.infoshare.sixseven;

import pl.infoshare.sixseven.exercise1.Robot;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class App {

    int a = 4;

    public static void main() throws URISyntaxException, IOException {
//        Square square = new Square();
//
//        myMethod2(square);
//
//        myMethod("1","2","3");
//
//        Calculator calculator = new Calculator();
//
//        System.out.println(calculator.add(5,5));
//        System.out.println(calculator.multiply(5,5));
//        System.out.println(calculator.divide(5,5));
//        System.out.println(calculator.substract(5,5));
//
//
//        /*
//        REPEAT
//         */
//
//        Cat cat = new Cat();
//
//        System.out.println("Kot ma " + cat.numberOfLegs + " lapy.");
//        System.out.println("Kot jest rasy " + cat.race);
//        System.out.println("Kot ma kolor " + cat.color);
//
//        cat.changeColor(Color.BLACK);
//
//        System.out.println("Kot zmienil kolor na " + cat.color);


//        Calculator calculator1 = new Calculator();
//
//        calculator1.add(2, 3);
//        calculator1.add(1,2);

        Robot robot = new Robot("Robot", "Right wing");
        Robot robot2 = new Robot("Charlie");
        printRobot(robot);
        printRobot(robot2);

    }

    private static void printRobot(Robot robot){
        System.out.println(robot.name);
        System.out.println(robot.politicalBelieves);
    }

    public static void myMethod2(Square arg1){
        System.out.println(arg1.calculateField());
        System.out.println(arg1.calculateDiagonal());
    }

    public static void myMethod(String... args) throws IOException {

//       for(int i = 0; i < args.length; i++){
//           System.out.println(args[i]);
//       }

        for (String arg : args) {
            System.out.println(arg);
        }

        URL uri = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
        long result = downloadFile(uri);
        System.out.println(result);

        Calculator calculator = new Calculator();
        System.out.println(calculator.someField);

        changeSomeField(calculator);
        System.out.println(calculator.someField);

        changeSomeField(calculator);
        System.out.println(calculator.someField);

    }

    public static void changeSomeField(Calculator calculator){
        calculator.someField += 5;
    }

    public static long downloadFile(URL uri) throws IOException {
        try (InputStream in = uri.openStream()) {
            return Files.copy(in, Paths.get("./fileFromURL.txt"), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
