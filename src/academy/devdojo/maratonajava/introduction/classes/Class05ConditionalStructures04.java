package academy.devdojo.maratonajava.introduction.classes;

//switch Satetement
public class Class05ConditionalStructures04 {
    public static void main(String[] args) {
        //Print the day of the week, considering 1 as sunday
        byte day = 5;
        //the switch statement only takes the following variables char int byte short enum String
        switch (day) {
            case 1:
                System.out.println("Sunday");
                //we have to use the break keyword in order to stop the flow
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            //default keyword works similarly to the else statement
            default:
                System.out.println("Invalid Option");
        }

    }
}
