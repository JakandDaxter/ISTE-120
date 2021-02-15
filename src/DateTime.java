import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
 *  Description: Homework 3 - Gregorian Calendar
 *  Class: Computational Problem Solving for the Information Domain I
 *  Date: ISTE - 120
 *  Author: Aliana Tejeda
 */

public class DateTime {

    public DateTime() {
    }

    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar(Locale.US);
        SimpleDateFormat formatter = new SimpleDateFormat("M/d/yyyy");

        System.out.println("Today's date is "+formatter.format(today.getTime()));

        today.add(Calendar.DATE,100);

        System.out.println("In 100 days it will be "+formatter.format(today.getTime())
                + ", which is day "+today.get(Calendar.DAY_OF_WEEK)+ " of the week");

        GregorianCalendar birthday = new GregorianCalendar(1986, Calendar.NOVEMBER, 27);
        System.out.println("My birthday date is "+formatter.format(birthday.getTime()));

        birthday.add(Calendar.DATE,10000);

        System.out.println("In 10,000 days it will be "+formatter.format(birthday.getTime())
                + ", which is day "+birthday.get(Calendar.DAY_OF_WEEK)+ " of the week");

    }
}
