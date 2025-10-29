import java.util.Scanner;

/*
Age Discounts:
0 to 2 years (baby): free (final price is $0, ignore other discounts/fees)

Additional Discounts:
Student: If a passenger has a current, valid student ID, then the passenger receives an additional 5% discount.
The 5% student discount is applied to the ticket cost after the age discount was applied.

name: Thomas Eng
day: Fri 
time: 17:00
age: 55
student (y/n)?: y

------------------------------------------------------
Name:    Thomas Eng
Day:     FRI
Time:    17:00
------------------------------------------------------
Base Price:         $   100.00 (RUSH HOUR FARE)
Age Discount:       $     0.00 (ADULT)
Student Discount:   $    -5.00
------------------------------------------------------
Final Cost:         $    95.00
------------------------------------------------------

 */

public class PartA {
    enum DAYOFWEEK {MON, TUES, WED, THUR, FRI, SAT, SUN}
    enum AGEGROUP {BABY, CHILD, ADULT, SENIOR}
    public static void main(String[] args) {
        
        // setting up Scanner
        Scanner in = new Scanner(System.in);

        // declaring all the variables
        String name, day, student, time;
        int hour, min, age;
        final String a = "Y";
        final String b = "N";
        double cost = 0;
        double costa, costb, costc;

        // setting values for each variable and checking make sure that the input is the right type
        System.out.print("Name: ");
        if (!in.hasNextLine() || in.hasNextInt() || in.hasNextDouble()) {
            System.err.printf("ERROR: Enter your name %nProgram Terminating");
            return;
        } else {
            name = in.nextLine();
        }

        System.out.print("Age: ");
        age = in.nextInt();
        if (!in.hasNextInt() || age < 0) {
            System.err.printf("ERROR: Enter your age %nProgram Terminating");
            return;
        } 

        System.out.print("Day: ");
        if (!in.hasNextLine()) {
            System.err.printf("ERROR: Enter the day %nProgram Terminating");
            return;
        } else {
            day = in.nextLine().toUpperCase();
        }

        System.out.printf("%nTime (HH:MM): ");
        time = in.nextLine();
        if (!in.hasNextLine() || !time.contains(":")) {
            System.err.printf("ERROR: Enter the time %nProgram Terminating");
            return;
        }

        //seperating hours and minutes
        hour = Integer.parseInt(time.substring(0,2));
        min = Integer.parseInt(time.substring(2, 5));
        if (hour > 0 || hour > 23 || min < 0 || min > 59) {
            System.err.print("ERROR: Enter time in HH:MM format%nProgram terminating");
        }


        //Determining if the user is a student or not
        System.out.print("Student (y/n): ");
        if (!in.hasNextLine()) {
            System.err.printf("ERROR: Enter y or n %nProgram Terminating");
            return;
        } else {
            student = in.nextLine().toUpperCase();
        }

        //Determining the day of the week
        switch (day) {
            case "MON":
            case "MONDAY":
            day = DAYOFWEEK.MON.toString();
            break; 
            case "TUES":
            case "TUESDAY":
            day = DAYOFWEEK.TUES.toString();
            break; 
            case "WED":
            case "WEDNESDAY":
            day = DAYOFWEEK.WED.toString();
            break; 
            case "THUR":
            case "THURSDAY":
            day = DAYOFWEEK.THUR.toString();
            break; 
            case "FRI":
            case "FRIDAY":
            day = DAYOFWEEK.FRI.toString();
            break; 
            case "SAT":
            case "SATURDAY":
            day = DAYOFWEEK.SAT.toString();
            break; 
            case "SUN":
            case "SUNDAY":
            day = DAYOFWEEK.SUN.toString();
            break; 
        }

        System.out.printf("%n%n--------------------------------------------------------%n");
        System.out.printf("Name:    %s%n", name);
        System.out.printf("Day:     %s%n", day);
        System.out.printf("Time:    %s%n", time);
        System.out.printf("%n%n--------------------------------------------------------%n");

        //Acounting for the cost difference if it is a weekend and rush hour
        if (DAYOFWEEK.SAT.toString().equals(day) || DAYOFWEEK.SUN.toString().equals(day)){
            cost = 80;
        } else if (!DAYOFWEEK.SAT.toString().equals(day) || !DAYOFWEEK.SUN.toString().equals(day)) {
            if (hour == 06 && min == 00 || hour == 07 && min <=59 || hour == 16 && min == 00 || hour == 17 && min <= 59) { 
            cost = 100;
        } else
            cost = 90;
        } 
        
    
        System.out.printf("Base Price:          $ %.2f (Base Cost)", cost);


        //Calculation for age discounts
        if (age >= 60) {
            cost = cost * 0.75;
        } else if (age >= 3 && age <=12){
            cost = cost * 0.8;
        } else if (age >=0 && age <= 2) {
            cost = 0;
            System.out.printf("%n%n--------------------------------------------------------%n");
            System.out.printf("Name:    %s%n", name);
            System.out.printf("Day:     %s%n", day);
            System.out.printf("Time:    %s%n", time);
            System.out.printf("%n%n--------------------------------------------------------%n");
            System.out.printf("Base Price:      $   %.2f", cost);
            System.out.printf("Age Discount:    $   %.2f", cost);
            System.out.printf("Base Price:      $   %.2f", cost);
            return;
        } 

        cost = cost * 0.95;
        
        
        System.out.printf("%n%n--------------------------------------------------------%n");
        
        
        System.out.printf("%n%n--------------------------------------------------------%n");

        in.close();
    }
}