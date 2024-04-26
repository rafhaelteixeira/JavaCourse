package academy.devdojo.maratonajava.javacore.Oexceptions.Exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.InvalidLoginException;

import java.util.Scanner;
//Testing Customized Exception
public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("Enter username: ");
        String typedUsername = input.nextLine();
        System.out.println("Enter password: ");
        String typedPassword = input.nextLine();

        if (!typedUsername.equals(usernameDB) || !typedPassword.equals(passwordDB)) {
            throw new InvalidLoginException("Invalid Login or Username");
        }
        System.out.println("User successfully logged in");
    }
}
