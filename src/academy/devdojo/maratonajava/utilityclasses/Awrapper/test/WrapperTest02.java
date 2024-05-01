package academy.devdojo.maratonajava.utilityclasses.Awrapper.test;

import java.util.Locale;

public class WrapperTest02 {
    public static void main(String[] args) {
        //we'll see now autoboxing and unboxing

        //Autoboxing - Java itself transforms a primitive type in a wrapper
        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 3;
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Character charW = 'W';
        Boolean booleanW = true;

        //unboxing - When we transform a wrapper type in a primitive type
        //we can still utilize the methods
        byte i = byteW.byteValue();
        short s = shortW;
        int j = intW;
        long l = longW;
        float f = floatW;
        double d = doubleW;
        char c = charW;
        boolean b = booleanW;

        //We can use parse to convert a string into a specified type
        Integer intW2 = Integer.parseInt("1");
        System.out.println(intW2);
        Boolean truce = Boolean.parseBoolean("true");
        System.out.println(truce);

        //we can also use several methods
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(charW.isLetterOrDigit('!'));


    }
}
