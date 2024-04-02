package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String userNameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("User: ");
        String userName = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();

        if (!userNameDB.equals(userName) || !passwordDB.equals(password)){
            throw new InvalidLoginException("Invalid Username or Password");
        }
        System.out.println("Login Successful");
    }
}
