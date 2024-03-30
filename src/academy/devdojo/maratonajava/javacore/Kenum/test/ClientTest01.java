package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.ClientType;
import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client = new Client("Tsubasa", ClientType.PESSOA_FISICA);
        //on the object creation we must pass the class and the constant
        Client client2 = new Client("Akira", ClientType.PESSOA_JURIDICA);
        //in this case we only have two client types, if we need another we must add to the enum class


        System.out.println(client);
        System.out.println(client2);

    }
}
