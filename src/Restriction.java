import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Restriction {
    private final String[] daysRestriction = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
    //"Rest" refers to "Restriction"

    //AM interval
    LocalTime iniAMRest = LocalTime.of(7,0);
    LocalTime endAMRest = LocalTime.of(9,30);

    //PM interval
    LocalTime iniPMRest = LocalTime.of(16,0);
    LocalTime endPMRest = LocalTime.of(19,30);

    public boolean isDayRest(LocalDate date, int lastDigit){
        //Function to evaluate if is a day when pico y placa applies
        String temp_day = date.getDayOfWeek().toString();
        for (String temp : daysRestriction){
            if (temp_day.equalsIgnoreCase(temp)){
                switch (lastDigit){
                    case 1:
                        if (temp_day.equalsIgnoreCase(daysRestriction[0])){
                            return true;
                        }
                    case 2:
                        if (temp_day.equalsIgnoreCase(daysRestriction[0])){
                            return true;
                        }
                    case 3:
                        if (temp_day.equalsIgnoreCase(daysRestriction[1])){
                            return true;
                        }
                    case 4:
                        if (temp_day.equalsIgnoreCase(daysRestriction[1])){
                            return true;
                        }
                    case 5:
                        if (temp_day.equalsIgnoreCase(daysRestriction[2])){
                            return true;
                        }
                    case 6:
                        if (temp_day.equalsIgnoreCase(daysRestriction[2])){
                            return true;
                        }
                    case 7:
                        if (temp_day.equalsIgnoreCase(daysRestriction[3])){
                            return true;
                        }
                    case 8:
                        if (temp_day.equalsIgnoreCase(daysRestriction[3])){
                            return true;
                        }
                    case 9:
                        if (temp_day.equalsIgnoreCase(daysRestriction[4])){
                            return true;
                        }
                    case 0:
                        if (temp_day.equalsIgnoreCase(daysRestriction[4])){
                            return true;
                        }
                    default:
                        return false;

                }
            }
        }
        return false;
    }

    public boolean isTimeRest(LocalDate date, LocalTime time, int lastDigit){
        //Function to evaluate if a licensePlate is within an hour of restriction
        boolean isRestrictionDay = false;
        isRestrictionDay = isDayRest(date, lastDigit);

        if (isRestrictionDay) {
            if (time.isAfter(iniAMRest) && time.isBefore(endAMRest)) {
                return true;
            } else return (time.isAfter(iniPMRest) && time.isBefore(endPMRest));
        }

        return isRestrictionDay;
    }

}
