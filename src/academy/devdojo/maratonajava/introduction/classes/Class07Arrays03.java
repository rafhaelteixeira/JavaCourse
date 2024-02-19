package academy.devdojo.maratonajava.introduction.classes;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        //we can initialize arrays directly, with the number of positions and the value
        //that will be stored in memory
        int[] numbers2 = {1, 2, 3, 4, 5};
        //an alternative syntax
        int[] numbers3 = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        System.out.println("========================================");

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }
        System.out.println("========================================");

        //foreach explanation and syntax - it's yet another loop tool
        //this for does not retrieve indexes, the loop finishes when the elements inside the array are printed
        for (int num : numbers3) {
            System.out.println(num);
        }
    }
}
