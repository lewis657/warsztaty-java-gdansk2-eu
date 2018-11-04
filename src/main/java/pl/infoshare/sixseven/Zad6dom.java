package pl.infoshare.sixseven;

import pl.infoshare.sixseven.zad1.User;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class Zad6dom {

  public static void main(String[] args) throws Exception {

      byte[] message = "hello world".getBytes(StandardCharsets.UTF_8);
      String encoded = Base64.getEncoder().encodeToString(message);
      System.out.println(encoded);
      byte[] decoded = Base64.getDecoder().decode("aGVsbG8gd29ybGQ=");
      System.out.println(new String(decoded, StandardCharsets.UTF_8));
// => hello world
     startProgram();


  }

    public static void startProgram() throws Exception
    {

        printMenu();

        //Wczytanie wyboru uzytkownika
        String userChoice = readUserInput();

        //Wywolaj metode do obslugi wyboru uzytkownika i przekaz pobrany z klawiatury wybor
        handleUserChoice(userChoice);
    }


    private static void handleUserChoice(String choice) throws Exception {
    //Obsluga wyboru uzytkownika
    switch (choice) {
      //Jesli uzytkownik wybierze 1
      case "1": {

          User user = generateUserFromUserInput();
        //  System.out.println(user.getType());
          if (user.getType().equalsIgnoreCase("ADMIN") || user.getType().equalsIgnoreCase("USER")){

              saveToFile(user);
              printSuccess();
              backToMenu();
          }
          else
          {
              System.out.println("Error Type! (Admin/User)");
              handleUserChoice("1");
          }


          break;
      }
      //Jesli uzytkownik wybierze 2
      case "2": {
          //Wczytanie linii z pliku
          List<String> fileLines = readLinesFromFile();
          //Stworzenie tablicy uzytkownikow
          User[] userArray = generateUserArray(fileLines);
          //Wypisanie tablicy uzytkownikow na ekran

          printUsersFromArray(userArray);
          //Zerwanie switch
          // printSuccess();
          startProgram();
        break;

      }
        case "0": {
            System.out.println("Wybarałeś zakończenie programu!");
            System.exit(0);
        }

      //Jesli uzytkownik wybierze cokolwiek innego
      default: {
        printError();
          startProgram();
        break;
      }
    }
  }

  /*
    Metoda wypisujaca uzytkownikow na ekran z podanej tablicy
   */

  private static void printUsersFromArray(User[] userArray) throws Exception{
    for (User user : userArray) {


        //System.out.println("Username: " + user.getUsername() + "\t" + "Password: " + user.getPassword()+ "\t" + "Typ: " + user.getType());
     // System.out.println("Username: " + Base64.getDecoder().decode(new String(user.getUsername()).getBytes(StandardCharsets.UTF_8)) + "\t" + "Password: " + Base64.getDecoder().decode(new String(user.getPassword()).getBytes(StandardCharsets.UTF_8))+ "\t" + "Typ: " + Base64.getDecoder().decode(new String(user.getType()).getBytes(StandardCharsets.UTF_8)));
    }
  }

  /*
    Metoda tworzaca tablice uzytkownikow z listy wierszy z pliku
   */
  private static User[] generateUserArray(List<String> linesFromFile) throws Exception {
    User[] userArray = new User[linesFromFile.size()];


    for (int i = 0; i < userArray.length; i++) {


      userArray[i] = generateUserFromFileInput(linesFromFile.get(i));
        System.out.println(userArray[i]);

    }
    return userArray;
  }

  /*
    Metoda wczytujaca wszystkie linie z pliku
   */
  private static List<String> readLinesFromFile() throws Exception {


    return Files.readAllLines(Paths.get("zad3.txt"));
  }

  /*
    Metoda ktora wyswietla menu
   */
  private static void printMenu() {

    System.out.println("\n========== MENU ==========");
    System.out.println("1.\t Dodaj uzytkownika.");
    System.out.println("2.\t Wyświetl uzytkowników.");
    System.out.println("0.\t Koniec programu.");
    System.out.print("Wybor: ");
  }


  /*
    Metoda do wypisywania informacji o poprawnie wykonanej operacji
   */
  private static void printSuccess()  {

    System.out.println("\nDODANO POPRAWNIE!\n");


  }

  /*
    Metoda do wypisywania informacji o zle wykonanej operacji
   */
  private static void printError() {
    System.out.println("\nBLAD! Zly wybor. \n");

  }

  /*
    Metoda tworzaca obiekt usera z wczytanego jednego wiersza z pliku
   */
  private static User generateUserFromFileInput(String lineFromFile) {
    String[] userSplitted = lineFromFile.split(";");

    return new User(userSplitted[0], userSplitted[1],userSplitted[2]);
  }

  /*
    Metoda zapisujaca wiele obiektow User do pliku
   */
  private static void saveToFile(User... users) throws Exception {
    for (User user : users) {
        //String strKey ="klucz";
            String line = Base64.getEncoder().encode(user.getUsername().getBytes(StandardCharsets.UTF_8)) + ";" + Base64.getEncoder().encode(user.getPassword().getBytes(StandardCharsets.UTF_8)) + ";" + Base64.getEncoder().encode(user.getType().getBytes(StandardCharsets.UTF_8)) + "\n";

            Files.write(Paths.get("./zad3.txt"), line.getBytes(), StandardOpenOption.APPEND);
        }



  }



 public static void backToMenu() throws Exception {
     System.out.print("Dodać kolejnego użytkonika? (Y/N) : ");  // ask the input from user
     String var = readUserInput();
     if(var.equalsIgnoreCase("N")){
         System.out.println("\nKoniec dodawania!\n");
         startProgram();
     }
     else
     {
         handleUserChoice("1");
     }

 }
// public static void  checkType(String field ) throws IOException {
//
//
//     if (field.equalsIgnoreCase("type"))
//     {
//         checkScanner(readUserInput());
//     }
//
// }
// public static void  checkScanner(String scanner) throws IOException {
//
//
//     if (scanner.equalsIgnoreCase("Admin"))
//     {
//         System.out.println("dupa");
//     }
//
// }
  /*
    Metoda proszaca o podanie username i password uzytkownika.
   */
  public static User generateUserFromUserInput() throws IOException{
    return new User(getFieldFromUserInput("username"), getFieldFromUserInput("password"),getFieldFromUserInput("type"));
  }

  /*
    Metoda wczytujaca pojedyncza informacje od uzytkownika i zwracajaca to co wpisal uzytkownik
   */
  private static String getFieldFromUserInput(String field)  {
    System.out.print("Provide " + field + ": ");
//      checkType(field);
    return readUserInput();
  }

  /*
    Metoda wczytujaca tekst wpisany przez uzytkownika
   */
  private static String readUserInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}
