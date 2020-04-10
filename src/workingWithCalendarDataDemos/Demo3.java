package workingWithCalendarDataDemos;

import java.time.LocalDateTime;

// local date time
// when you wish to store date + time as: year-month-dayThours:minutes:seconds
public class Demo3 {
  public static void main(String[] args) {
    LocalDateTime localDateTime1 = LocalDateTime.of(2997, 07, 17, 23, 59, 59);
    LocalDateTime localDateTime2 = LocalDateTime.parse("1997-07-07T00:07:50");
    LocalDateTime localDateTime3 = LocalDateTime.now();

    System.out.println(localDateTime3.getMonthValue());
    System.out.println(localDateTime3.getDayOfMonth());
    System.out.println(localDateTime3.getDayOfWeek());
    System.out.println(localDateTime3.getDayOfYear());
    System.out.println(localDateTime1.isAfter(localDateTime2));
    System.out.println(localDateTime1.isBefore(localDateTime2));
    System.out.println(localDateTime1.isEqual(localDateTime1));
  }
}
