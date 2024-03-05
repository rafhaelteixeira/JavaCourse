package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.domain;
//when to use static or non static?
//the good practice dictates that a static method can be used when the methods don't access an instance attribute
//using the calculator app, all the methods can be converted into static, because they do not need to access instance
//attributes
public class Car {
    private String name;
    private double maxSpeed;
    //with the static keyword, the attributes will refference the class, not the objects created by that class
    //any alteration made on the static attributes will affect all of the objects created by that class
    private static double limitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("---------------");
        System.out.println("name " + this.name);
        System.out.println("Max Speed " + this.maxSpeed);
        System.out.println("Limit Speed " + Car.limitSpeed);
        //Car.setLimitSpeed(250); - this code would work
    }

    public static void setLimitSpeed(double limitSpeed){
        Car.limitSpeed = limitSpeed;
        //Static methods cannot access non static attributes, nor call non static methods, nor use the this keyword
        //this happens because there's a possibility of non existence of objects variables
        //but the other way arround is possible, non static methods can access static attributes
        //and call static methods
        //this happens because it's always possible to exist a class
        //example on the print method
    }

    public static double getLimitSpeed(){
        return Car.limitSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
