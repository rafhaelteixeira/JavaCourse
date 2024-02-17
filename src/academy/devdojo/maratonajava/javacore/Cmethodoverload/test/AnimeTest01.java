package academy.devdojo.maratonajava.javacore.Cmethodoverload.test;

import academy.devdojo.maratonajava.javacore.Cmethodoverload.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Naruto", "Shounen", 525);
        //by changing the arguments, the code runs without problems
        anime.init("Boruto", "Shounen", 525, "Action");
        //if we run the program, the second method will subscribe the first one
        anime.print();
    }

}
