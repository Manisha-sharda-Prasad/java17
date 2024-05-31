package com.manisha.java.Fundamental.exercise.ifElse;

import com.manisha.java.util.Print;

public class Exercise10_SecondsAndMinutes {
public static String getDurationString(int seconds)
{
    int minutes = seconds/60;
    int secondRemainder = seconds % 60;
    int hour = minutes/60;
    int minuteRemainder = minutes % 60;
    String duration  = hour+"h "+minuteRemainder+"m "+secondRemainder+"s";
//    if ( seconds > 0){
//        Print.info("seconds : "+seconds,duration);
//    }
//    else {
//        Print.info("Invalid value");
//    }
    return duration;
}

public static String getDurationString(int min, int sec){
    Print.info("minutes : "+ min, "Seconds : "+ sec);
    int totalSeconds = (min * 60 )+ sec;
    return getDurationString(totalSeconds);
}

public static void main(String[] args) {
    getDurationString(4586);
    getDurationString(120, 500);

//
//    LocalDateTime date = LocalDateTime.now();
//    ZonedDateTime zone = ZonedDateTime.now();
//    Print.info(date, zone);
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy   hh:mm:ss:SSSS");
//    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy   HH:mm:ss:SSSSSSS");
//    Print.info(date.format(formatter), date.format(formatter2));
 }

}
