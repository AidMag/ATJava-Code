import java.util.Scanner;

/*
Aidan
 */

public class PartA {
    enum DAYOFWEEK {MON, TUES, WED, THUR, FRI, SAT, SUN}
    enum AGEGROUP {BABY, CHILD, ADULT, SENIOR}
    public static void main(String[] args) {
        
        // setting up Scanner
        Scanner in = new Scanner(System.in);

        // declaring all the variables
        String name, time;
        boolean isStudent = false;
        int hour = 0; 
        int min = 0;
        int age = 0;
        double cost = 0, final_cost = 0;
        double discount = 0, age_discount = 0;
        String age_group = "ADULT";

        // setting values for each variable and checking make sure that the input is the right type
        System.out.print("Name: ");
        name = in.nextLine();

        System.out.print("Age: ");
        if (!in.hasNextInt()) {
            System.err.printf("ERROR: Enter your age%nProgram terminating");
            in.close();
            return; 
        }
        age = in.nextInt();
        in.nextLine();
        if (age < 0){
            System.err.printf("ERROR: Enter your age%nProgram terminating");
            in.close();
            return;
        } 

        //Using age group enumuration
        if (age >= 60) {
            age_group = "SENIOR";
        } else if (age >= 3 && age <= 12){
            age_group = "CHILD";
        } else if (age <= 2) {
            age_group = "BABY";
        } else {
            age_group = "ADULT";
        }

        // get day.
        DAYOFWEEK day;
        System.out.print("Day (abriviation): ");
        String reply = in.nextLine().trim();
        if (reply.toLowerCase().equals("sat")) {
            day = DAYOFWEEK.SAT;
        } else if (reply.toLowerCase().equals("sun")) {
            day = DAYOFWEEK.SUN;
        } else if (reply.toLowerCase().equals("mon")) {
            day = DAYOFWEEK.MON;
        } else if (reply.toLowerCase().equals("tues")) {
            day = DAYOFWEEK.TUES;
        } else if (reply.toLowerCase().equals("wed")) {
            day = DAYOFWEEK.WED;
        } else if (reply.toLowerCase().equals("thur")) {
            day = DAYOFWEEK.THUR;
        } else if (reply.toLowerCase().equals("fri")) {
            day = DAYOFWEEK.FRI;
        } else {
            System.err.printf("ERROR: could not understand day of week.%nProgram Terminating");
            in.close();
            return;
        }
        
        
        System.out.printf("Time (HH:MM): ");
        time = in.nextLine();
        if (!time.contains(":")) {
            System.err.printf("ERROR: Enter the time %n Program Terminating");
            in.close();
            return;
        }

        //seperating hours and minutes
        int i = time.indexOf(":");
        hour = Integer.parseInt(time.substring(0, i));
        min = Integer.parseInt(time.substring(i + 1, i + 3));
        if (hour < 0 || hour > 23 || min < 0 || min > 59) {
            System.err.print("ERROR: Enter time in HH:MM format %nProgram terminating");
            in.close();
            return;
        }


        //Determining if the user is a student or not
        System.out.print("Student (y/n): ");
        reply = in.nextLine().trim().toUpperCase();
        if (!reply.equals("Y") && !reply.equals("N")) {
            System.err.printf("ERROR: Enter y or n %nProgram Terminating");
            in.close();
            return;
        } else if (reply.equals("Y")) {
            isStudent = true;
        } else if (reply.equals("N")){
            isStudent = false;
        }

        //Acounting for the cost difference if it is a weekend and rush hour
        if (DAYOFWEEK.SAT.toString().equals(day) || DAYOFWEEK.SUN.toString().equals(day)){
            //weekend
            final_cost = 80;
            cost = 80;
        } else if (!DAYOFWEEK.SAT.toString().equals(day) && !DAYOFWEEK.SUN.toString().equals(day)) {
            if (hour == 06 && min == 00 || hour == 07 && min <=59 || hour == 16 && min == 00 || hour == 17 && min <= 59) { 
            final_cost = 100;
            cost = 100;
            //week day rush hour
        } else {
            final_cost = 90;
            cost = 90;
            //week day normal
        }   

        //Calculation for age discounts
        if (AGEGROUP.SENIOR.toString().equals(age_group)) {
            final_cost = final_cost * 0.75;
            age_discount = final_cost * 0.25;
        } else if (AGEGROUP.CHILD.toString().equals(age_group)){
            final_cost = final_cost * 0.8;
            age_discount = final_cost * 0.2;
        } else if (AGEGROUP.BABY.toString().equals(age_group)) {
            cost = 0;
            System.out.printf("%n%n--------------------------------------------------------%n");
            System.out.printf("Final Cost:          $ %6.2f", cost);
            in.close();
            return;
        } 

        if (isStudent == true) {
            discount = final_cost * 0.05 * -1;
            final_cost = final_cost * 0.95;
        } else if (isStudent == false){
            discount = 0;
        }
        
        System.out.printf("%n--------------------------------------------------------%n");
        System.out.printf("Name:    %s%n", name);
        System.out.printf("Day:     %s%n", day);
        System.out.printf("Time:    %02d:%02d", hour, min);
        System.out.printf("%n--------------------------------------------------------%n");
        System.out.printf("Base Price:          $ %6.2f%n", cost);        
        System.out.printf("Age Discount:        $ %6.2f%n", age_discount);
        System.out.printf("Student Discount:    $ %6.2f", discount);
        System.out.printf("%n--------------------------------------------------------%n");
        System.out.printf("Final Price:         $ %6.2f%n", final_cost); 
        in.close();
        }
    }  
}   