package workingWithCalendarDataDemos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

// Period class
// represents date based amount in years, months and days
// for time based amount in hours, minutes, seconds and nanos, use duration class
public class Demo4 {
  public static void main(String[] args) {
    // instantiating period
    Period period1 = Period.of(2, 5, 1);
    Period period2 = Period.ofYears(20);
    Period period3 = Period.ofDays(2);
    Period period4 = Period.ofMonths(2);
    Period period5 = Period.ofWeeks(3);
    Period period6 = Period.ofDays(-15);

    Period p5Yrs1 = Period.parse("P5y");
    Period p5Yrs2 = Period.parse("p5y");
    Period p5Yrs3 = Period.parse("P5Y");
    Period p5Yrs4 = Period.parse("+P5Y");
    Period p5Yrs5 = Period.parse("P+5Y");
    Period p5Yrs6 = Period.parse("-P-5Y");
    System.out.println(
        p5Yrs1 + ":" + p5Yrs2 + ":" + p5Yrs3 + ":" + p5Yrs4 + ":" + p5Yrs5 + ":" + p5Yrs6);

    Period p5Yrs7 = Period.parse("P5y1m2d");
    Period p5Yrs8 = Period.parse("p9m");
    Period p5Yrs9 = Period.parse("P60d");
    // no. of weeks are multiplied by 7 to give no. of days
    Period p5Yrs10 = Period.parse("-P5W");

    System.out.println(p5Yrs7 + ":" + p5Yrs8 + ":" + p5Yrs9 + ":" + p5Yrs10);

    LocalDate date1 = LocalDate.of(1997, 07, 17);
    LocalDate date2 = LocalDate.now();
    System.out.println(Period.between(date1, date2));

    // Manipulating localdate and localdatetime using period

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(date1.plus(Period.ofYears(23)));
    System.out.println(localDateTime.minus(Period.ofMonths(7)));

    // Querying period instances
    Period period = Period.of(5, 3, 1);
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());

    System.out.println(Period.of(0, 0, 5).isZero());
    System.out.println(Period.of(0, 6, -8).isNegative());

    // manipulating Period
    Period period10Days = Period.of(0, 0, 10);
    Period period1Month = Period.of(0, 1, 0);
    System.out.println(period10Days.minus(period1Month));
    System.out.println(period10Days.minusDays(5));
    System.out.println(period10Days.minusMonths(5));
    System.out.println(period10Days.minusYears(5));

    Period year1Month9Day20 = Period.of(1, 9, 20);
    System.out.println(year1Month9Day20.multipliedBy(2));
    System.out.println(year1Month9Day20.multipliedBy(-2));

    Period period5Month = Period.of(0, 5, 0);
    Period period10Month = Period.of(0, 10, 0);
    // Period period10Days = Period.of(0, 0, 10);

    System.out.println(period5Month.plus(period10Month)); // P15M
    System.out.println(period10Days.plusDays(35)); // P45D
    System.out.println(period10Days.plusMonths(5)); // P5M10D
    System.out.println(period10Days.plusYears(5)); // P5Y10D

    System.out.println(period.withDays(2));
    System.out.println(period.withMonths(2));
    System.out.println(period.withYears(2));

    // converting to another type
    System.out.println(period.toTotalMonths());
  }
}
