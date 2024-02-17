package academy.devdojo.maratonajava.introduction.classes;

public class Class05ConditionalStructures02 {
    public static void main(String[] args) {
        //age < 15 = sophmore category
        //age >= 15 && age <18 = Junior
        //age >= 18 = Senior
        //When we have multiple conditions we can utilize nested if statements
        //utilizing else if (){}
        int age = 17;

        if (age < 15) {
            System.out.println("Sophmore");
        } else if (age >= 15 && age < 18) {
            System.out.println("Junior");
        } else {
            System.out.println("Senior");
        }

        //A cleaner way to solve the same problem would be creating a category variable

        int age2 = 14;
        String category;

        if (age2 < 15) {
            category = "sophmore";
        } else if (age2 >= 15 && age2 < 18) {
            category = "Junior";
        } else {
            category = "Senior";
        }
        System.out.println(category);
    }
}
