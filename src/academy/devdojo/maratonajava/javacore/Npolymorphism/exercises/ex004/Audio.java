package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex004;

public class Audio extends Media{

    public Audio(String name, String format) {
        super(name, format);
    }

    @Override
    public void play() {
        if (this.format.equalsIgnoreCase("MP3")){
            System.out.println("Playing Audio File - " + this.name + "." + this.format.toLowerCase());
        }else {
            System.out.println("Invalid format");
            return;
        }
    }
}
