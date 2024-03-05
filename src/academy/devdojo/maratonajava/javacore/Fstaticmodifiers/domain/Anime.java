package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.domain;

//Class copied from the initializer blocks class
public class Anime {
    private String name;
    private static int[] episodes;
    //0 - Static Initializer block is executed when the JVM load the class
    //1 - memory space allocated for the object
    //2 - each class attribute is created and initialized with default values, or what is passed.
    //3 - initialization block is executed
    //4 - Constructor is executed

    //instance initialization blocks are executed when an object is created
    //they are executed before the constructors and methods
    //we can add a logic inside, in order to not repeat code every time we instantiate an object
    static {//this static block will be executed once
        //we could call static methods inside this block
        System.out.println("Inside the static block1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        //they are not usually used, but static methods are
    }

    static {
        System.out.println("Inside the static block2");
        //by adding more static blocks, they are executed in the order of appearance
        //each will be executed only once
    }

    {
        System.out.println("Inside the non static block");
        //we can also add non static blocks, these will be executed every time an object is created
        //they'll be executed after the static methods
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
