package academy.devdojo.maratonajava.introduction.classes;

//part 1 Aritmethic Operators
public class Class04Operators {
    public static void main(String[] args) {
        //Basic operators + - / * % (Division Modulus)
        int num1 = 10;
        int num2 = 20;
        //to use operators just place one between numbers or variables with stored numbers
        System.out.println(num2 - num1);
        //operators concatenated after strings might concatenate the numbers instead of realize a mathematical operation
        System.out.println("value " + num1 + num2); //outputs: value 1020
        //using the operators before the string will result in the operation, but afterwards will concatenate
        System.out.println(num1 + num2 + " This Value" + num1 + num2);// outputs: 30 this value 1020
        //we can store the result inside another variable
        int result = num1 + num2;
        System.out.println(result);
        int modulus = 20 % 3;
        System.out.println(modulus);

        //Part 2 Relational Operators
        //They will always return a boolean value (T or F)
        //< > <= >= == !=

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenNotEqualsTwenty = 10 != 20;

        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenEqualsTwenty);
        System.out.println(isTenNotEqualsTwenty);

        //Part 3 Logical Operators - AND(&&), OR(||), NOT (!)
        //Return a boolean value
        // AND (&&) all conditions must be True to return true
        int age = 35;
        float salary = 3500F;
        boolean isInTheLawGreaterThanThirty = age > 30 && salary >= 4612;
        boolean isInTheLawLessThanThirty = age < 30 && salary >= 3381;

        System.out.println(isInTheLawGreaterThanThirty);
        System.out.println(isInTheLawLessThanThirty);

        //OR (||)
        //one of the conditions must return true
        double bankAccountTotalBalance = 200;
        double savingsAccountTotalBalance = 10000;
        float playstationValue = 5000;

        boolean isPlaystationBuyable = bankAccountTotalBalance > playstationValue || savingsAccountTotalBalance > playstationValue;
        System.out.println("isPlaystationBuyable: " + isPlaystationBuyable);

        //Part 4 Atribution Operators
        // = , += , -= , *= , /= , %=

        double bonus = 1800;
        bonus += 100; //can be written : bonus = bonus + 100;
        System.out.println("Bonus: " + bonus);
        bonus *= 1.5; //can be written: bonus = bonus * 1.5;
        System.out.println("bonus: " + bonus);
        //So On...

        //Increment and decrement

        int counter = 0;
        counter += 1;
        System.out.println("counter " + counter);
        counter++;
        System.out.println("counter " + counter);
        counter--;
        System.out.println("counter " + counter);
        ++counter; //can be added before or after the variable
        //before the variable increments first, after increments after.
        System.out.println("counter " + counter);


    }
}
