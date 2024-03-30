package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex002;

public class Transport {
    private String name;
    private Transportation transportation;

    public Transport(String name, Transportation transportation) {
        this.name = name;
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", transportation=" + transportation +
                '}';
    }

    public String getName() {
        return name;
    }

    public Transportation getTransportation() {
        return transportation;
    }
}
