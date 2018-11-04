package pl.infoshare.sixseven;

import pl.infoshare.sixseven.zad1.User;

import java.util.Scanner;

public class Zad1Main {

    public static void main(String[] args){

        System.out.print("Provide username: ");
        String username = readUserInput();

        System.out.print("Provide password: ");
        String password = readUserInput();
        System.out.print("Podaj typ: ");
        String typ = readUserInput();

        User user = new User(username, password, typ);

        System.out.println("Stworzono uzytkownika " + user.getUsername() + "\t\t" + "O hasle: " + user.getPassword()+ "\t\t" + "Typ: " + user.getType());
    }

    private static String readUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
