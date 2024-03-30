package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;
    private ClientType clientType;//the client has a client type
    //By passing the enum type we are creating a relationship between classes

    public Client(String name, ClientType clientType) {
        this.name = name;
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clienType=" + clientType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clienType) {
        this.clientType = clienType;
    }
}
