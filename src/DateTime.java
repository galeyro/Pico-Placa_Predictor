import java.time.LocalDate;
import java.time.LocalTime;

import static java.lang.Integer.parseInt;

public class DateTime {
    private LocalDate date;
    private LocalTime time;

    public DateTime(LocalDate date, LocalTime time){
        this.date=date;
        this.time=time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void getDay(){
        System.out.print(date.getDayOfWeek());
    }
}
