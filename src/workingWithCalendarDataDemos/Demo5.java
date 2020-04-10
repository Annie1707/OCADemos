package workingWithCalendarDataDemos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// DateTimeFormatter
public class Demo5 {
  public static void main(String[] args) {
    // instantiate or access date time formatter
    DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
    DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
    DateTimeFormatter formatter4 =
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);

    DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
    DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("yyyy MM dd");

    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    LocalDate date = LocalDate.of(2057, 8, 11);
    System.out.println(formatter.format(date));

    LocalTime time = LocalTime.of(14, 30, 15);
    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
    DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
    DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
    DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");
    DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
    DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");
    System.out.println(d1.format(date));
    System.out.println(d2.format(date));
    System.out.println(d3.format(date));
    System.out.println(d4.format(date));
    System.out.println(t1.format(time));
    System.out.println(t2.format(time));

    DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date1 = LocalDate.parse("2057-01-29", d);
    System.out.println(date1);
  }
}
