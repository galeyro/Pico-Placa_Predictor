import java.time.LocalDate;
import java.time.LocalTime;

public class Restriction {
    private final String[] daysRestriction = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
    //"Rest" refers to "Restriction"
    private LocalTime iniMorRest;
    private LocalTime endMorRest;
    private LocalTime iniAftRest;
    private LocalTime endAftRest;

    public boolean isDayRest(LocalDate date){
        //Function to evaluate if is a day when pico y placa applies
        String temp_day = date.getDayOfWeek().toString();

        for (String temp : daysRestriction){
            if (temp_day.equalsIgnoreCase(temp)){
                return true;
            }
        }

        return false;
    }

    public boolean isTimeRest(LocalTime time){
        //Function to evaluate if a licensePlate is within an hour of restriction
        return false;
    }
}
