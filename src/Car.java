import static java.lang.Integer.parseInt;

public class Car {
    //Attributes--------------------------------
    private final String licensePlate;

    //Methods-----------------------------------

    //Constructor
    public Car(String licensePlate){
        this.licensePlate = licensePlate;
    }

    //Function to get the last digit of the license plate
    public int getLastDigit(){
        //Pending!!!
        //Fix error when the last digit is not a number
        return parseInt(String.valueOf(licensePlate.charAt(licensePlate.length() - 1)));
    }
}
