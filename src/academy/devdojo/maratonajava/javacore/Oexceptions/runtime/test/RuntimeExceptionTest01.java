package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked and Unchecked
        //runtime are Unchecked exceptions happens when there is a development error
        //we do not need to make validations in order for the code compiles

        //This code will throw a nullPointer exception
        Object object = null;
        System.out.println(object.toString());

        //this code will throw indexOutOfBounds exception
        int[] nums = new int[]{1,2};
        System.out.println(nums[2]);


    }
}
