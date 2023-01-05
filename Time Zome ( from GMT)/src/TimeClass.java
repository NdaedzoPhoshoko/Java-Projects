import java.time.format.DateTimeFormatter; // package to collect local time
import java.time.LocalTime;

public class TimeClass {
    //get current time at Limpopo or at any location
    DateTimeFormatter getTime = DateTimeFormatter.ofPattern("hh:mm:ss");
    LocalTime getTimeNow = LocalTime.now();
    String iContainTime = getTime.format(getTimeNow); //time will be in hh:mm:ss and collected to a string

    //collecting the hours from iContainTime
    int myHours = Integer.parseInt(iContainTime.substring(0, 2));// hours contain number like 12
    //collecting the minutes from iContainTime
    int myMinutes = Integer.parseInt(iContainTime.substring(3, 5));
   //collecting the seconds from iContainTime
   int mySeconds = Integer.parseInt(iContainTime.substring(6,8));


}
