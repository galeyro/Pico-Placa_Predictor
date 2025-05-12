import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @param date Attributes--------------------------------
 */
public record DateTime(LocalDate date, LocalTime time) {

    public void getDay() {
        System.out.print(date.getDayOfWeek());
    }
}
