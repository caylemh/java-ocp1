import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.format.FormatStyle;

public class Ex1_Date {
    public static void main(String[] args) {
        ZonedDateTime myDate = ZonedDateTime.now();
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));

        HijrahDate hDate = HijrahDate.from(myDate.minusMonths(5));
        JapaneseDate jDate = JapaneseDate.from(myDate);

        System.out.println("Today's Date:" + " " + sDate);
        System.out.println("Today's Date:" + " " + fDate);
        System.out.println("Today's Date:" + " " + jDate);
        System.out.println("The date for 5 Months back:" + " " + hDate);
    }
}