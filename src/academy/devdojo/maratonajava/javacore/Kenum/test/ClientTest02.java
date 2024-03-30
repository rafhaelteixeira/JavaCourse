package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client02;
import academy.devdojo.maratonajava.javacore.Kenum.domain.PaymentType;
import academy.devdojo.maratonajava.javacore.Kenum.domain.ClientType;

public class ClientTest02 {
    public static void main(String[] args) {
        Client02 client = new Client02("Tsubasa", ClientType.PESSOA_FISICA, PaymentType.DEBIT);
        Client02 client2 = new Client02("Akira", ClientType.PESSOA_JURIDICA, PaymentType.CREDIT);

        System.out.println(client);
        System.out.println(client2);

        System.out.println("---------------------------------------------");

        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));

        System.out.println("----------------------------------------------");

        //Getting client type with the valueOf() method, we must pass the enum type
        //it will return the relatory passed on the toString method
        ClientType clientType = ClientType.valueOf("PESSOA_FISICA");
        System.out.println(clientType.getRelatoryName());
        //getting client type by relatory name, we must pass the relatory name
        //this will return the enum type
        //see code on clientType
        ClientType clientType2 = ClientType.clientTypeByRelatoryName("Pessoa Física");
        System.out.println(clientType2);
    }
}
