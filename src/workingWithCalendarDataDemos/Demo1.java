package workingWithCalendarDataDemos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

// LocalDate
// this is an immutable class
public class Demo1 {
  public static void main(String[] args) {
    // creating localdate
    LocalDate date1 = LocalDate.of(1997, 07, 17);
    LocalDate date2 = LocalDate.of(1997, Month.JULY, 07);

    LocalDate date3 = LocalDate.now();

    LocalDate date4 = LocalDate.parse("1997-08-20");
    // following can't be parsed
    // LocalDate date5 = LocalDate.parse("1997/08/20");

    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);
    System.out.println(date4);
    // DateTimeParseException
    // System.out.println(date5);

    // Querying local date

    System.out.println(date1.getDayOfMonth());
    System.out.println(date1.getDayOfWeek());
    System.out.println(date1.getDayOfYear());
    System.out.println(date1.getMonth());
    System.out.println(date1.getMonthValue());
    System.out.println(date1.getYear());

    System.out.println(date1.isAfter(date2));
    System.out.println(date1.isBefore(date2));
    System.out.println(date1.isEqual(date1));

    // manipulating local date
    System.out.println(date1.minusDays(17));
    System.out.println(date1.minusMonths(1));
    System.out.println(date1.minusWeeks(2));
    System.out.println(date1.minusYears(2));

    System.out.println(date1.plusDays(17));
    System.out.println(date1.plusWeeks(1));
    System.out.println(date1.plusMonths(1));
    System.out.println(date1.plusYears(1));

    System.out.println(date2.withDayOfMonth(1));
    System.out.println(date2.withDayOfYear(1));
    System.out.println(date2.withMonth(7));
    System.out.println(date2.withYear(1));

    // Converting to another type
    System.out.println(date1.atTime(16, 30));
    System.out.println(date1.atTime(16, 30, 40));
    System.out.println(date1.atTime(16, 30, 40, 300));
    System.out.println(date1.atTime(LocalTime.now()));

    /*
    epoch date—the count of days from January 1, 1970:
     */
    LocalDate date5 = LocalDate.of(1970, 01, 10);
    System.out.println(date5.toEpochDay());
  }
}
