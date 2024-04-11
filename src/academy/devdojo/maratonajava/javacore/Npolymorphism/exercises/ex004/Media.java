package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex004;

public abstract class Media {
    protected String name;
    protected String format;

    public Media(String name, String format) {
        this.name = name;
        this.format = format;
    }

    public abstract void play();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
