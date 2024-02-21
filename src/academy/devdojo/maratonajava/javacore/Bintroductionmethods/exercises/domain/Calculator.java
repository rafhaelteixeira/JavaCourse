package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Design a Calculator class with methods for basic arithmetic operations
(addition, subtraction, multiplication, division).*/
public class Calculator {
    private double result;


    public void addition(double number1, double number2) {
        this.result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);

    }

    public void subtraction(double number1, double number2) {
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
    }

    public void multiplication(double number1, double number2) {
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
    }

    public void division(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("You can't divide a number by 0");
            return;
        }
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
    }


    public void setNumber1() {
    }


    public void setNumber2() {
    }


}
