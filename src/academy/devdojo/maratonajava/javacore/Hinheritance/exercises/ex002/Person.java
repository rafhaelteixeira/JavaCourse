package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex002;
/*Design a class hierarchy for a school system. You can have a superclass Person with subclasses
like Student, Teacher, and Staff.
Each subclass can have specific attributes and methods related to their role in the school.*/
public class Person {
    protected String name;
    protected int age;
    protected long id;

    public Person(String name, int age, long id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
}
