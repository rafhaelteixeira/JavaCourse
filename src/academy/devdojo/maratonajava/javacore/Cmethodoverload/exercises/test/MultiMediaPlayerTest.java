package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.test;

import academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain.MultiMediaPlayer;

public class MultiMediaPlayerTest {
    public static void main(String[] args) {
        MultiMediaPlayer player1 = new MultiMediaPlayer();
        player1.setFileName("Sunblind");
        player1.setTypeName("Audio");
        player1.setSource("/usr/rafhael/desktop/Sunblind.mp4");
        player1.playMediaFiles(player1.getFileName(), player1.getTypeName(), player1.getSource());

        MultiMediaPlayer player2 = new MultiMediaPlayer();
        player2.setFileName("Java Dev Dojo");
        player2.setTypeName("video");
        player2.setSource("https://youtube.com");
        player2.setPlatform("Youtube");
        player2.playMediaFiles(player2.getFileName(), player2.getTypeName(), player2.getSource(), player2.getPlatform());

        player1.print();
        System.out.println("------------------------------------------------");
        player2.print();
    }
}
