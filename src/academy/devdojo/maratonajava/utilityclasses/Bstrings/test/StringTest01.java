package academy.devdojo.maratonajava.utilityclasses.Bstrings.test;

public class StringTest01 {
    //Strings in Java are immutable
    public static void main(String[] args) {
        String name = "Rafhael"; //String constant pool
        //Strings are created in a String pool, they are immutable, if we create another one, java won't duplicate it
        String name2 = "Rafhael";
        System.out.println(name == name2);
        //if we run the output would be true, both variables are refferencing the same String on Java String pool
        name.concat(" Teixeira");
        System.out.println(name == name2);
        //this code shows the immutability of strings, will also output true
        System.out.println(name);
        //by trying to print the String we can see that even though we utilized concatenation, the output remains "Rafhael"
        //to solve this we must create or assign a refference variable to the new string
        name = name.concat(" Teixeira"); // name += " Teixeira"
        System.out.println(name);
        System.out.println(name == name2);

        //If we create a string with this syntax, we are actually creating it on the memmory heap
        //instead of the String pool
        //on real life development this approach is not used
        String name3 = new String("Rafhael");
        //so, this command will output false, since the String is created elsewhere
        System.out.println(name2 == name3);
        //this command will output true, because the name3 value is beeing compared with the value that we have
        //on the string pool
        System.out.println(name2 == name3.intern());

    }
}
