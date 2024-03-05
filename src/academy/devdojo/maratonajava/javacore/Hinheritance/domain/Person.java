package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Person {
   protected String name;
   //now all the subclasses can use this attributes directly, as well as classes on the same package
    //as if they were public
   protected String cpf;
   protected Address address;

   static {
       System.out.println("Inside the Person Static Block");
   }

    {
        System.out.println("Inside the Person Initializer block1");
    }

    {
        System.out.println("Inside the Person Initializer block");
    }

   //if we define a constructor in the parent class, we must create a constructor in the child classes
   public Person(String name){
       super();//every class in java is a child of a class called Object, so in theory we can use super keyword
       //on parent classes as well
       this.name = name;
       System.out.println("Inside the Person Constructor");
   }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet() + " " + this.address.getZip());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
