package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex004;

public class Video extends Media{

    public Video(String name, String format) {
        super(name, format);
    }

    @Override
    public void play() {
        if (this.format.equalsIgnoreCase("MP4")){
            System.out.println("Playing Video File - " + this.name + "." + this.format.toLowerCase());
        }else {
            System.out.println("Invalid format");
            return;
        }
    }
}
