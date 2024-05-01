package academy.devdojo.maratonajava.utilityclasses.Cdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        //Second class created by java developers to solve internationalization problems
        //it's an abstract class, so we can't instantiate it with new, we can use:
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        System.out.println("-------------------------");

        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 2);
        calendar.roll(Calendar.HOUR, 12);
        date = calendar.getTime();
        System.out.println(date);
        //Classes Date and Calendar can be important to work with legacy Systems
        //Modern system will utilize classes from the time packages


    }
}
