package academy.devdojo.maratonajava.utilityclasses.Cdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //the Date class has been around since the beggining of Java
        //it's understanding is important to understand other classes that came after
        //it is still useful, but has several deprecated methods
        Date date = new Date(1714402359446L);//works in milliseconds - long 100000
        System.out.println(date);
    }
}
