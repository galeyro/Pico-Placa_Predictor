import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Car {
    private String licensePlate;

    public Car(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getLastDigit(){
        //Pending
        //Fix error when the last digit is not a number
        return parseInt(String.valueOf(licensePlate.charAt(licensePlate.length()-1)));
    }


}
