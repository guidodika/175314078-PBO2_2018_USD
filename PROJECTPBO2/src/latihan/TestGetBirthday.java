/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan;
import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.text.DateFormatSymbols;
import java.util.GregorianCalendar;

public class TestGetBirthday {
  public static void main(String[] args) {

    GregorianCalendar birthdate = new GregorianCalendar(1999, 9, 14);
    GregorianCalendar today = new GregorianCalendar(); // Today's date
    GregorianCalendar birthday = new GregorianCalendar(today.get(YEAR), birthdate.get(MONTH),
        birthdate.get(DATE));
    int age = today.get(today.YEAR) - birthdate.get(YEAR);
    String[] weekdays = new DateFormatSymbols().getWeekdays(); // Get day names
    System.out.println("You were born on a " + weekdays[birthdate.get(DAY_OF_WEEK)]);
    System.out.println("This year you " + (birthday.after(today) ? " will be " : "are ") + age
        + " years old.");
    System.out.println("In " + today.get(YEAR) + " your birthday "
        + (today.before(birthday) ? "will be" : "was") + " on a "
        + weekdays[birthday.get(DAY_OF_WEEK)] + ".");
    
    /* In all methods of class Date that accept or return year, month, date, hours, minutes, and seconds values, the following representations are used:

    A year y is represented by the integer y - 1900.
    A month is represented by an integer from 0 to 11; 0 is January, 1 is February, and so forth; thus 11 is December.
    A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
    An hour is represented by an integer from 0 to 23. Thus, the hour from midnight to 1 a.m. is hour 0, and the hour from noon to 1 p.m. is hour 12.
    A minute is represented by an integer from 0 to 59 in the usual manner.
    A second is represented by an integer from 0 to 61; the values 60 and 61 occur only for leap seconds and even then only in Java implementations that actually track leap seconds correctly. 
    Because of the manner in which leap seconds are currently introduced, it is extremely unlikely that two leap seconds will occur in the same minute, but this specification follows the date and time conventions for ISO C. */
    
  }
}
/**
 *
 * @author admin
 */



    
