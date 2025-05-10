import java.time.LocalDate;
import java.time.LocalTime;

abstract class Restriction {
    private String[] daysRestriction = {"Mon","Tue","Wed","Thu","Fri"};
    //"Rest" refers to "Restriction"
    private LocalTime iniMorRest;
    private LocalTime endMorRest;
    private LocalTime iniAftRest;
    private LocalTime endAftRest;

    public boolean isDayRest(LocalDate date){
        //Function to evaluate if is a day when pico y placa applies
        return false;
    }

    public boolean isTimeRest(LocalTime time){
        //Function to evaluate if a licensePlate is within an hour of restriction
        return false;
    }
}
