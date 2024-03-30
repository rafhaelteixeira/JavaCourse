package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client02 {

    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Client02(String name, ClientType clientType, PaymentType paymentType) {
        this.name = name;
        this.clientType = clientType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client02{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getRelatoryName() +
                ", clientTypeInt=" + clientType.VALUE +
                //the value will change according with what is passed on the object creation
                ", paymentType=" + paymentType +
                '}';
    }
}
