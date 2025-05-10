import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(get_inputLicensePlate());

        LocalDate inputDate = setDate(get_inputDate());
        LocalTime inputTime = setTime(get_inputTime());

        DateTime dateTime = new DateTime(inputDate, inputTime);
        System.out.println(car.getLicensePlate());
        System.out.println(dateTime.getDate());
        System.out.println(dateTime.getTime());

    }

    private static String get_inputLicensePlate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the license plate: ");
        return scanner.nextLine();
    }

    private static String get_inputDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date (dd/MM/yyyy): ");
        return scanner.nextLine();
    }

    private static String get_inputTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in 24h format (hh:mm): ");
        return scanner.nextLine();
    }

    private static LocalDate setDate(String inputDate){
        int day = parseInt(inputDate.substring(0,2));
        int month = parseInt(inputDate.substring(3,5));
        int year = parseInt(inputDate.substring(6,10));

        return LocalDate.of(year, month, day);
    }

    private static LocalTime setTime(String inputTime){
        int hour = parseInt(inputTime.substring(0,2));
        int minute = parseInt(inputTime.substring(3,5));

        return LocalTime.of(hour,minute);
    }
}
