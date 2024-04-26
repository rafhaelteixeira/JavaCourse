package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //a few examples of runtime exceptions

        //if we try to call a method from a null object, we'll get a NullPointerException
        Object object = null;
        System.out.println(object.toString());

        //if we try to access an array index that doesn't exists, we'll get an ArrayIndexOutOfBoundsException
        int nums[] = {1,2};
        System.out.println(nums[2]);

        //note that the code compiles, so we don't need to provide treatment to these exceptions
        //the exception occurs at run time
    }
}
