package academy.devdojo.maratonajava.utilityclasses.Awrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //Wrappers are objects that encapsulate primitive types
        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4L;
        float floatP = 5F;
        double doubleP = 6D;
        char charP = 'W';
        boolean booleanP = false;

        //To create a wrapper we simply change the first letter to upper case
        //Except int and char
        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 3;
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Character charW = 'W';
        Boolean booleanW = true;
        //these classes now are not primitive types, so we must be careful with them
        //they do not follow the same rules of casting as primitive types
        //instead they now follow the rules of polymorphism, because they now are objects
        //they were created so we can pass values by refference
        //Also data structures in java collections do not work with primitive types

        //if we call the refference we can utilize its methods
        System.out.println(booleanW.compareTo(booleanP));
        //good practices dictate that if we can use primitive types, we should use them
        //wrappers can be used in specific cases that primitive types are not possible
            //for example with collections

    }
}
