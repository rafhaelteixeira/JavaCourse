package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening File");
            System.out.println("Writing data on file");
            return "Opened Connection";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing opened resource by the SO");
        }
        return null;
    }
}
