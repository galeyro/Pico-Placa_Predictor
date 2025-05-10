import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DateTime {
    private LocalDate date;
    private LocalTime time;

    public DateTime(LocalDate date, LocalTime time){
        this.date=date;
        this.time=time;
    }

    public String get_inputDate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the license plate: ");
        return scanner.nextLine();
    }

    public String get_inputTime(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the license plate: ");
        return scanner.nextLine();
    }
}
