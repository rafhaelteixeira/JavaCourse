package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex004;

public class Main {
    public static void main(String[] args) {
        Media audio = new Audio("Over the Horizon", "mp3");
        audio.play();

        System.out.println("---------------------------------------");

        Media video = new Video("Stairway to Heaven - Live at MSG", "Mp4");
        video.play();
    }
}
