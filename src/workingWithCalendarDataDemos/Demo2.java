package workingWithCalendarDataDemos;

import java.time.LocalDate;
import java.time.LocalTime;

// Local time
// this is immutable class
public class Demo2 {
  public static void main(String[] args) {
    // creating local time
    LocalTime time1 = LocalTime.now();
    LocalTime time2 = LocalTime.of(0, 59);
    LocalTime time3 = LocalTime.of(0, 59, 59);
    LocalTime time4 = LocalTime.of(0, 59, 59, 590000000);

    System.out.println(time1);
    System.out.println(time2);
    System.out.println(time3);
    System.out.println(time4);

    LocalTime time5 = LocalTime.parse("23:59:59");
    System.out.println(time5);

    System.out.println(LocalTime.MIN);
    System.out.println(LocalTime.MAX);
    System.out.println(LocalTime.MIDNIGHT);
    System.out.println(LocalTime.NOON);
    System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT));

    // Querying local time
    System.out.println(time1.getHour());
    System.out.println(time1.getMinute());
    System.out.println(time1.getSecond());
    System.out.println(time1.getNano());

    System.out.println(time1.isAfter(time2));
    System.out.println(time1.isBefore(time2));

    // manipulating local time
    System.out.println(time1.minusHours(1));
    System.out.println(time1.minusMinutes(10));
    System.out.println(time1.minusSeconds(100));
    System.out.println(time1.minusNanos(1000));

    System.out.println(time1.plusHours(1));
    System.out.println(time1.plusMinutes(10));
    System.out.println(time1.plusSeconds(100));
    System.out.println(time1.plusNanos(1000));

    System.out.println(time1.withHour(1));
    System.out.println(time1.withMinute(01));
    System.out.println(time1.withSecond(10));
    System.out.println(time1.withNano(100));

    // combining with another type
    System.out.println(time1.atDate(LocalDate.now()));
  }
}
