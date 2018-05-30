package pl.sda.javastartTwo.dates;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DatesExamples {

    public static void main(String[] args) {

        instant();
        // durations();
        //locallolDateTime();
        // dateUtils();
    }

    private static void dateUtils() {

        Date date = new Date();
        Instant instant = date.toInstant();

        Date from = Date.from(instant);

        Calendar calendar = Calendar.getInstance();
        Instant calendartoInstant = calendar.toInstant();

        LocalDate now = LocalDate.now();

        System.out.println("Czy to rok przestepny:" + now.isLeapYear());

        boolean before = now.isBefore(LocalDate.of(2004, 8, 8));

        System.out.println(before);

        System.out.println("3 weeks ago " + now.minusWeeks(3));

        System.out.println("First day of this month " + now.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastYearDay = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last day of this year " + lastYearDay);

        Period period = now.until(lastYearDay);
        System.out.println("Months form now to last day in years = " + period.getMonths());

    }

    private static void locallolDateTime() {

        LocalDateTime now = LocalDateTime.now();
        Date date = new Date();
        System.out.println("LocalDateTime" + now);
        System.out.println("Date" + date);

        LocalTime locaclTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();

        LocalDateTime of = LocalDateTime.of(localDate, locaclTime);

        System.out.println(of);

        LocalDateTime time = LocalDateTime.of(2014, 1, 9, 4, 4, 23, 42);
        //LocalDateTime.of(2014, Month.JANUARY, 34, 4, 4, 23, 42); // uwazac na miesiace

        System.out.println(time);

        LocalDateTime nowINTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(nowINTokyo);


    }

    private static void durations() {

        Duration duration30days = Duration.ofDays(30);
        System.out.println("30 days = " + duration30days);
    }

    private static void instant() {

        Instant now = Instant.now(); // to daje czas i date aktualana

        System.out.println("Current timestamp: " + now);

        Instant epochMIli = Instant.ofEpochMilli(22234341323L);

        System.out.println("Specific time from epoch" + epochMIli);
    }
}
