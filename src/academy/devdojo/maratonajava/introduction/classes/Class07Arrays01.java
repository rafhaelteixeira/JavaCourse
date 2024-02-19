package academy.devdojo.maratonajava.introduction.classes;

public class Class07Arrays01 {
    public static void main(String[] args) {
        //arrays store multiple values inside a single "variable"
        //we declare an array by instantiating it with the new keyword.
        int[] ages = new int[3];//we determine how many positions the array will have
        ages[0] = 21;//we can initialize the indexes storing values on them
        ages[1] = 15;
        ages[2] = 11;

        //printing values stored on positions
        System.out.println(ages[0]);//the index will always start on 0
        System.out.println(ages[1]);
        System.out.println(ages[2]);


    }
}
