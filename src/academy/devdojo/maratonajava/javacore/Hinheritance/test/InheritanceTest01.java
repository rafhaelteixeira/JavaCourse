package academy.devdojo.maratonajava.javacore.Hinheritance.test;

import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Address;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Street 3");
        address.setZip("57062632");

        Person person = new Person("Rafhael");

        person.setCpf("11100360433");
        person.setAddress(address);

        person.print();
        System.out.println("-----------------------------------");

        //by instantiating an object from child class we can assign all attributes and methods
        //inheritance creates strongly coupled classes, any alteration on the parent class, affects the child class
        Employee employee = new Employee("Ronald");

        employee.setCpf("11100002225");
        employee.setAddress(address);
        employee.setSalary(1500);
        employee.print();
        System.out.println("-------------------------");
        employee.paymentReceipt();
    }
}
