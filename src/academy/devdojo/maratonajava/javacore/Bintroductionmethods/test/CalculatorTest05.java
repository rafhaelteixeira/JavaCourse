package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest05 {
    //we can change the main method's syntax to varArgs as well
    public static void main(String... args) {
        Calculator calculator = new Calculator();
        //declaring the array, as we normally do
        int[] numbers = {1, 2, 3, 4, 5};
        //passing the array as a argument
        calculator.sumArray(numbers);

        //an alternate syntax to pass the array as argument for the method directly
        calculator.sumArray(new int[]{1, 2, 5, 8, 10});
        //with the varArgs syntax we can pass the array values directly as arguments on the method call
        calculator.sumVarArgs(1, 2, 3, 4, 5, 6, 10);
        //the code will output the same result.
    }
}
