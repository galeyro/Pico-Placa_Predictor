import java.sql.SQLOutput;
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

        Restriction restriction = new Restriction();

        System.out.println("\nThe input values are: ");
        System.out.print("License plate: ");
        System.out.println(car.getLicensePlate());
        System.out.print("Date: ");
        System.out.println(dateTime.getDate());
        System.out.print("Time: ");
        System.out.println(dateTime.getTime());

        int lastDigit = car.getLastDigit();
        System.out.print("The last digit of the license plate is: ");
        System.out.println(lastDigit);

        System.out.println("The day is: ");
        dateTime.getDay();

        System.out.println("\nIs a restriction day?");
        boolean isRestrictionDay = false;
        isRestrictionDay = restriction.isDayRest(dateTime.getDate());
        if (isRestrictionDay){
            System.out.println("Is restriction day!!!");
        } else {
            System.out.println("Free");
        }

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
