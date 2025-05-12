import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        //Enter license plate and create new Car
        String inputLicensePlate = get_inputLicensePlate();
        Car car = new Car(inputLicensePlate);

        //Enter date and time and create new DateTime
        LocalDate inputDate = setDate(get_inputDate());
        LocalTime inputTime = setTime(get_inputTime());
        DateTime dateTime = new DateTime(inputDate, inputTime);

        //Instance Restriction to get access to functions
        Restriction restriction = new Restriction();

        //Include last digit of license plate in scope of main
        int lastDigit = car.getLastDigit();

        //Show the result of the predictor in console
        boolean isRestrictionHour = restriction.isTimeRest(dateTime.date(), dateTime.time(), car.getLastDigit());

        if (isRestrictionHour) {
            System.out.println("\nPICO & PLACA IS APPLYING =(");
        } else {
            System.out.println("\nYOU ARE FREE OF RESTRICTION =D");
        }
    }

    //Methods-----------

    //User input functions
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

    //Setters for DateTime attributes
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
