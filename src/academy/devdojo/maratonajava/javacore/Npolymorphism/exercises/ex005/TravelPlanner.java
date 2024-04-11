package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex005;

import java.util.Scanner;

public class TravelPlanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the travel planner app");
        System.out.println("Choose the number of the vehicle");
        System.out.println("1 - Car | 2 - Bus | 3 - Train");

        int choice = input.nextInt();

        Vehicle vehicle;

        switch (choice){
            case 1:
                vehicle = new Car("Car", 4 ,100);
                break;
            case 2:
                vehicle = new Bus("Bus", 35, 120);
                break;
            case 3:
                vehicle = new Train("Train", 100, 200);
                break;
            default:
                System.out.println("Invalid Choice, Defaulting to car");
                vehicle = new Car("Car", 4 ,100);
        }
        vehicle.travel();
    }
}
