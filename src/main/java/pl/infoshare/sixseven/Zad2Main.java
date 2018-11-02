package pl.infoshare.sixseven;

import pl.infoshare.sixseven.zad1.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Zad2Main {

    public static void main(String[] args) throws IOException {
        User user1 = generateUserFromUserInput();
        User user2 = generateUserFromUserInput();

        saveToFile(user1, user2);

        List<String> userList = Files.readAllLines(Paths.get("./zad2.txt"));

        User[] userArray = new User[userList.size()];

        for (int i = 0; i < userArray.length; i++){
            userArray[i] = generateUserFromFileInput(userList.get(i));
        }

        for(User user : userArray){
            System.out.println("Username: " + user.getUsername() + "\t" + "Password: " + user.getPassword());
        }
    }

    private static User generateUserFromFileInput(String lineFromFile){
        String[] userSplitted = lineFromFile.split(";");
        return new User(userSplitted[0], userSplitted[1]);
    }

    private static void saveToFile(User... users) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("./zad2.txt");
        for(User user : users){
            printWriter.append(user.getUsername() + ";" + user.getPassword() + "\n");
        }
        printWriter.close();
    }

    private static User generateUserFromUserInput(){
        return new User(getFieldFromUserInput("username"), getFieldFromUserInput("password"));
    }

    private static String getFieldFromUserInput(String field){
        System.out.print("Provide " + field + ": ");
        return readUserInput();
    }

    private static String readUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
