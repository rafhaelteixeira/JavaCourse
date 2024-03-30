package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum ClientType {
    //enum class is a special class where all the created types are constants
    PESSOA_FISICA(1, "Pessoa Física"),
    //we do not need to pass a primitive type
    //the enum type in this case will be ClientType
    //we can also create attributes inside an enum (see fields)
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    //by using enums we have complete control of what is necessary to create the object,
    //and we are able to maintain data consistency
    //enums can also be created inside a class, however, is not a good practice
    public final int VALUE;
    //to successfully create attributes, we have to specify their types
    //i'ts also necessary to create a constructor
    private final String RELATORY_NAME;
    ClientType(int value, String relatoryName) {
        //creating constructor
        this.VALUE = value;
        this.RELATORY_NAME = relatoryName;
    }
    //on the method bellow, we will attempt to get the clientype based on the String type relatoryName
    public static ClientType clientTypeByRelatoryName(String relatoryName){
        //the enum class has a few methods that we can use
        for (ClientType clientType : values()) {//values() return an array of all enumerations
            if (clientType.getRelatoryName().equals(relatoryName)){
                return clientType;
            }
        }
        return null;

    }
    //we can get the values with a getter
    //doesn't make sense to create a setter, since we're dealing with constants
    public int getValue() {
        return VALUE;
    }
    public String getRelatoryName(){
        return RELATORY_NAME;
    }
}
