import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        //User enter licenseplate and create a new car
        String inputLicensePlate = get_inputLicensePlate();
        Car car = new Car(inputLicensePlate);

        LocalDate inputDate = setDate(get_inputDate());
        LocalTime inputTime = setTime(get_inputTime());

        DateTime dateTime = new DateTime(inputDate, inputTime);

        Restriction restriction = new Restriction();


        int lastDigit = -1;
        try {
            lastDigit = car.getLastDigit();
        } catch (Exception e) {
            System.out.println("Use the format for LICENSE PLATE please ([characters]-[numbers])");
        }

        System.out.print("The last digit of the license plate is: ");
        System.out.println(lastDigit);

        System.out.println("The day is: ");
        dateTime.getDay();

        System.out.println("\nIs a restriction day?");
        boolean isRestrictionDay = false;
        isRestrictionDay = restriction.isDayRest(dateTime.getDate(), car.getLastDigit());
        if (isRestrictionDay) {
            System.out.println("Is restriction day!!!");
        } else {
            System.out.println("Free");
        }

        boolean isRestrictionHour = false;

        isRestrictionHour = restriction.isTimeRest(dateTime.getDate(), dateTime.getTime(), car.getLastDigit());
        if (isRestrictionHour) {
            System.out.println("YOU DO NOT GO OUT");
        } else {
            System.out.println("FREE");
        }
    }

    private static String get_inputLicensePlate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the license plate ([characters]-[numbers]): ");
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

    private static LocalDate setDate(String inputDate) {
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            day = parseInt(inputDate.substring(0, 2));
            month = parseInt(inputDate.substring(3, 5));
            year = parseInt(inputDate.substring(6, 10));
        } catch (Exception e) {
            System.out.println("Use the format for DATE please (dd/HH/yyyy)");
        }
        return LocalDate.of(year, month, day);
    }

    private static LocalTime setTime(String inputTime) {
        int hour = 0;
        int minute = 0;
        try {
            hour = parseInt(inputTime.substring(0, 2));
            minute = parseInt(inputTime.substring(3, 5));
        } catch (Exception e) {
            System.out.println("Use the format for TIME please (hh:mm)");
        }
        return LocalTime.of(hour, minute);
    }
}
