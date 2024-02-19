package academy.devdojo.maratonajava.introduction.classes;

public class Class07Arrays02 {
    public static void main(String[] args) {
        //each type, is inialized on a array with a default value, listed bellow:
        //byte, sort, int, long, float and double = 0
        //char '\u0000' - prints a blank space
        //boolean = false
        //reference types = null
        String[] names = new String[4];
        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";
        names[3] = "Hinata";


        //we can't change the arrays lenght dinamicly, we have to change the code and recompile
        //example of an iteration over an array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("================================================================");
        //if we instanciate a new array object, the memory of the first one will die, and be
        //cleaned up by java's garbage collector, so we won't be able to retrieve it anymore
        names = new String[5];
        names[0] = "Sasuke";
        names[1] = "Naruto";
        names[2] = "Ichigo";
        names[3] = "Inoue";
        names[4] = "Hirotora";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }
}
