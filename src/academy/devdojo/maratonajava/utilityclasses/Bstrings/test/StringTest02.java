package academy.devdojo.maratonajava.utilityclasses.Bstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        //we'll take a look at the main methods from String class
        String name = "Luffy";
        System.out.println(name.charAt(0));//returns the String based on it's index
        System.out.println(name.length());//returns the length of the String
        System.out.println(name.replace("f", "l"));//changes characters in the String
        System.out.println(name.toLowerCase() + " " + name.toUpperCase());//makes uppercase or lowercase

        System.out.println("================================");
        //SubStrings
        String numbers = "   012345   ";
        //if we call this, will return the String lenght
        System.out.println(numbers.length());
        //well pass the starting index and the finish index
        //the final index is exclusive, meaning the method will call the index before the one passed
        System.out.println(numbers.substring(0,2));//outputs 01
        //we can use this syntax to make life easier
        System.out.println(numbers.substring(3, numbers.length()));
        //in this case we can remove the other argument. it's an overloaded method
        System.out.println(numbers.substring(1));
        //This one removes blank values in the beggining and in the end of the string
        System.out.println(numbers.trim());

    }
}
