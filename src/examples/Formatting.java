package examples;


import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Formatting {

    public static void main(String args[]) {
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.DECEMBER, 15, 15, 0, 30);
        System.out.println("without formatting " + dateTime);

        String isoDateTime = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("iso date time " + isoDateTime);

        String isoDate = dateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println("iso date  " + isoDate);

        String isoTime = dateTime.format(DateTimeFormatter.ISO_TIME);
        System.out.println("iso time  " + isoTime);

        String patternDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss"));
        System.out.println("using pattern  " + patternDateTime);
    }
}
