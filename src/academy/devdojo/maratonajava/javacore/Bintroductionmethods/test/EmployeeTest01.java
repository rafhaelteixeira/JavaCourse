package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Kuririn");
        employee.setAge(25);
        employee.setSalarys(new double[]{1200, 987.32, 2000});


        employee.printData();
        employee.salaryAverage();


    }
}
