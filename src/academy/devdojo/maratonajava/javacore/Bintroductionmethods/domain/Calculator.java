package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

//methods can be used to provide behavior to objects
public class Calculator {
    public void sumTwoNumbers() {
        //we are declaring a method that returns void
        //adn i'ts behavior is to print the sum of 10 + 10
        System.out.println(10 + 10);
    }

    public void subTwoNumbers() {

        System.out.println(25 - 22);
    }

    //We can also utilize parameters
//they are variables, that will be utilized inside the context of a method
    public void multiTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    //in order for the method return something we must specify the return type, in this case we're using double
    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
            //if the condition returns true, the method will be stoped and return 0
        }
        return num1 / num2;
        //this code will return the division of the numbers passed as arguments in the method call
        //if we return the value 0, it will stop the execution of the method
    }

    //same code as above, but with different logical operations
    public double divideTwoNumbers2(double num1, double num2) {
        //we can change the logic, to achieve the same result.
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void printDivision(double num1, double num2) {
        //we can treat the execution of void methods with return; without values
        //if condition returns true, the method will be stopped
        if (num2 == 0) {
            System.out.println("You can't divide a number by zero");
            return;
        }//with that syntax we can loose the else statement
        System.out.println(num1 / num2);
        //else {
//            System.out.println(num1 / num2);
//        }
    }

    //when we utilize primitive type as parameters, a copy is made on memory
//so we are not referencing the original variable - it will never be altered
    public void alterTwoNumbers(int number1, int number2) {
        number1 = 99;
        number2 = 33;
        System.out.println("Inside the Method");
        System.out.println("num1 " + number1);
        System.out.println("num2 " + number2);
    }

    //we can pass an array as a parameter inside a method the same way we declare them normally
    public void sumArray(int[] numbers) {
        //for this method see CalculatorTest05 class
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    //as an alternative, we can utilize the varArgs to pass an array as parameter
    //the varArgs, must be the only or the last parameter passed to the method
    public void sumVarArgs(int... numbers) {
        //for this method see CalculatorTest05 class
        //the logic is the same, but the method call in the main method will vary
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);

    }
}
