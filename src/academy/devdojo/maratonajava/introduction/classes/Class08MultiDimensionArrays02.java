package academy.devdojo.maratonajava.introduction.classes;

//initializing multidimensional arrays
public class Class08MultiDimensionArrays02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        //this code will return a null pointer exepcion
        //we are referencing something that doesn't exist.
//        for (int[] arrayBase: arrayInt){
//            for (int num : arrayBase){
//                System.out.println(num);
//            }
//        }
        //We need to initialize somehow the inner array, example bellow
        //we are saying that the arrayInt on index 0 receives an array of 2 positions
//        arrayInt[0] = new int[2];
//        arrayInt[1] = new int[4];
//        arrayInt[2] = new int[6];
        //we can initialize the inside arrays the same way as unidimensional arrays
        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = new int[]{3, 4, 5, 6};
        arrayInt[2] = new int[]{7, 8, 9, 10};
        //note that we have to utilize the new int keyword, otherwise the compiler will not
        //know that we are trying to initialize an array inside another one

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n============================================================");
        //yet another way to initialize a multidimensional array
        int[][] arrayInt2 = {{1, 2}, {3, 4, 5,}, {6, 7, 8, 9, 10}};
        //in this example we are declaring a 3 positions array, and inside each position
        //we have a 2,3 and five position arrays, with their values initialized
        //the iteration will be the same as before
        for (int[] arrayBase2 : arrayInt2) {
            System.out.println("\n--------");
            for (int num2 : arrayBase2) {
                System.out.print(num2 + " ");
            }
        }

    }
}
