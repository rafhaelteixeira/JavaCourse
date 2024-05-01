package academy.devdojo.maratonajava.utilityclasses.Bstrings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
         String name = "Rafhael Teixeira";
         name.concat(" DevDojo ");
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Rafhael Teixeira");
        //one of the reasons why string builder is faster is because it makes the append directly
        //it doesn't have to create a string in the string pool. That can increase instability
        sb.append(" DevDojo ").append(" Academy ");
        //we can have multiple appends, but if there are a lot of them, that could decrease readability
        //we can also have multiple methods with StringBuilder
        //we must pay attention to the method's return type
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
