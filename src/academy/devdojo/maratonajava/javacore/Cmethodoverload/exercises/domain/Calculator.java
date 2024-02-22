package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain;
/*Design a class representing a calculator.
Implement overloaded methods for basic arithmetic operations
(addition, subtraction, multiplication, division)
that can accept different combinations of parameters
(e.g., two integers, two doubles, an integer and a double).*/
public class Calculator {
    private String operationName;
    private double result;

    public void calculateResult(String operationName, int n1, int n2){
        this.operationName = operationName;
        this.result = n1 + n2;
        System.out.println(result);
    }

    public void calculateResult(String operationName, double n1, double n2){
        this.operationName = operationName;
        this.result = n1 * n2;
        System.out.println(result);
    }

    public void calculateResult(String operationName, double n1, int n2){
        if (n1 / 2 == 0){
            System.out.println("Error: division by 0");
            return;
        }
        this.operationName = operationName;
        this.result = n1 / n2;
        System.out.println(result);
    }

    public void calculateResult(double n1, double n2){
        this.result = n1 - n2;
        System.out.println(result);
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
}
