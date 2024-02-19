package academy.devdojo.maratonajava.introduction.classes;

public class Class05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyBooze = age >= 18;

        //if statements receive a boolean expression, and are executed if the condition returns true.

        if (isAuthorizedBuyBooze) {
            System.out.println("Authorized to buy Booze");
        }
        //! Operator
        if (!isAuthorizedBuyBooze) { //we can utilize == false;
            System.out.println("Not Authorized to buy booze");
        }//By using two if statements we have independent instructions

        //for certification purposes
        boolean c = true;
        if (c = false) {
            System.out.println("Inside something that should never be done on the job");
        }

        //else statements can be use when the if statement returns false
        //the compiler will ignore the if statement and execute the else statement
        //by using the else statement we have two dependent instructions
        //when the if statement returns false the else statement will always be executed
        if (isAuthorizedBuyBooze) {
            System.out.println("Authorized to buy Booze");
        } else {
            System.out.println("Not Authorized to buy booze");
        }
    }
}
