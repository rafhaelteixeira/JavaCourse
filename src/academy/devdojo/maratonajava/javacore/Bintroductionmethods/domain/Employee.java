package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salarys;
    //by removing the setAvg method, this attribute can't be manipulated by other classes
    //it's now a read only attribute
    private double avg;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);

        if (salarys == null) {
            return;
        }
        for (double salary : salarys) {
            System.out.print(salary + " ");
        }
        salaryAverage();
    }

    public void salaryAverage() {
        if (salarys == null) {
            return;
        }
        for (double salary : salarys) {
            avg += salary;

            avg /= salarys.length;
        }
        System.out.println("\nSalary Average " + avg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalarys() {
        return salarys;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public double getAvg() {
        return avg;
    }
}
