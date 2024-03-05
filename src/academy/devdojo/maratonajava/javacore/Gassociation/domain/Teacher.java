package academy.devdojo.maratonajava.javacore.Gassociation.domain;

public class Teacher {
    private String name;
    //in this case teacher doesn't have a school
    //because it's a relationship many to one
    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
