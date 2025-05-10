import java.util.Scanner;

public class Car {
    private String licensePlate;

    public Car(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String get_inputLicensePlate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the license plate: ");
        return scanner.nextLine();
    }
}
