/*
java.time and java.base and time are the parent packages
*/

import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Today's date is " + today);
        System.out.print("The time is " + time);

    }
}
