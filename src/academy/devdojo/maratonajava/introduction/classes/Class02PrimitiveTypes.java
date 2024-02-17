package academy.devdojo.maratonajava.introduction.classes;

//Primitive Types
public class Class02PrimitiveTypes {//for classes utilize PascalCase

    //Part 1 - Naming Conventions
    public static void main(String[] args) {
        //We have 8 primitive types
        // int, double, float, char, byte, short, long, boolean
        int fatherAge = 50; // for variables, utilize camelCase
        System.out.println(fatherAge); //prints the value stored on the variable.
        System.out.println("Prints a String");
        System.out.println("The Age is: " + fatherAge + " Years Old");//+ Concatenates a String with a variable value

        //Part 2 - Declaration and memory size

        int age = 10;//4 Bytes - interger
        long longAge = 20;//8 Bytes - interger
        double salaryDouble = 2000;//8 Bytes - decimal
        float salaryFloat = 2500;//4 Bytes - decimal
        byte ageByte = 10;//1 Byte - interger
        short ageShort = 10;//2 Bytes - interger
        boolean truce = true;//1 Bit - Binary
        boolean falsity = false;//1 Bit - Binary
        char character = 'A';//2 Bytes - Character - Also  Unicode and ASCII tables values

        //Part 3 - Casting

        double secondSalary = 200.0;
        float thirdSalary = 300.0F;
        int ageSecond = (int) 10000000000L;
        System.out.println(ageSecond);

        //Part 4 - Strings - Not a primitive Type

        String nome = "A biiiiiig ass text goes here";
        System.out.println("Maybe " + nome + ", just maybe");
    }
}
