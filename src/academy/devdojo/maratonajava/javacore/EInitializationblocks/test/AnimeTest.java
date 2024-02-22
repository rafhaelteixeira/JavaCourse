package academy.devdojo.maratonajava.javacore.EInitializationblocks.test;

import academy.devdojo.maratonajava.javacore.EInitializationblocks.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
