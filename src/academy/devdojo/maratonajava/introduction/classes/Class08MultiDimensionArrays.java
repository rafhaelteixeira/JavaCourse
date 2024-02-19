package academy.devdojo.maratonajava.introduction.classes;

public class Class08MultiDimensionArrays {
    public static void main(String[] args) {
        //1,2,3,4,5 (Months)
        //31, 28, 31, 30 (Days)
        //this array represents an array of arrays
        //the first array's indexes store on memory another array of three positions
        //on the second array's indexes we have values stored
        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 31;
        days[1][1] = 28;
        days[1][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println("================================================");
        //on the first for the variable must be a refference type
        for (int[] arrBase : days) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

    }
}
