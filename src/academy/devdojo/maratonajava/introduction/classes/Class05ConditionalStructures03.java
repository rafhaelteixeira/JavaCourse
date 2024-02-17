package academy.devdojo.maratonajava.introduction.classes;

//ternary Operator
public class Class05ConditionalStructures03 {
    public static void main(String[] args) {
        //donate if salary > 5000
        double salary = 6000;
        String donateMessage = "I'll donate 500 today";
        String notDonateMessage = "I won't donate 500";
        String result;
        //this is the way we've been learning so far
        if (salary > 5000) {
            result = donateMessage;
        } else {
            result = notDonateMessage;
        }
        System.out.println(result);

        //for simple conditions such as these, we can use the ternary operator
        //the syntax is: String result = (condition) ? true : false; - Bellow an example
        int salary2 = 1000;
        String donateMessage2 = "I'll donate 500 today";
        String notDonateMessage2 = "I won't donate 500";
        String result2 = salary < 5000 ? donateMessage2 : notDonateMessage2;
        System.out.println(result2);
        //this operator can be used for multiple conditions, but it's not recomended
        //example
        int age = 20;
        String category;

        category = age < 15 ? "sophmore" : age >= 15 && age < 18 ? "Junior" : "Senior";
        System.out.println(category);
    }
}
