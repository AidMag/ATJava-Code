import java.util.Scanner;

/*
Weekday (Mon-Fri): 
$100.00 during rush hour (06:00 to 07:59, 16:00 to 17:59)
$  90.00 otherwise
Weekend (Sat, Sun):
$  80.00

Age Discounts:
0 to 2 years (baby): free (final price is $0, ignore other discounts/fees)
3 to 12 years (child): 20% discount
13 to 59 years (adult): no age-based discount
60+ (senior): 25% discount 

Additional Discounts:
Student: If a passenger has a current, valid student ID, then the passenger receives an additional 5% discount.
The 5% student discount is applied to the ticket cost after the age discount was applied.

Processing 24 Hour Time
The user will enter the time in 24-hour format. For example, 6:15PM would be entered as "18:15". Your program should use String methods to parse the hour and minute from the text.
First check to make sure the user entered in a colon (':') character in the string. If they did not, display an error message and exit the program using a return statement.
You can use the Integer.parseInt() method to extract the hour and the minute from the text:
Assume the hour is to the left of the ':' character.
Assume the minute is to the right of the ':' character.

Test Plan
Before coding their solution, students should create a set of test cases that they will use to verify that their program works.
Be sure to submit for grading your test plan and include your test results indicating whether or not each test case was successful.  


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
        
        Scanner in = new Scanner(System.in);

        String name;
        String day;
        String student;
        String time;
        final String a = "Y";
        final String b = "N";
        double cost;
        int age;


        System.out.print("Name: ");
        if (!in.hasNextLine()) {
            System.err.print("ERROR: Enter your name %nProgram Terminating");
            return;
        } else {
            name = in.nextLine();
        }

        System.out.print("Age: ");
        if (!in.hasNextInt()) {
            System.err.printf("ERROR: Enter your age %nProgram Terminating");
        } else {
            age = in.nextInt();
        }

        System.out.print("Day: ");
        if (!in.hasNextLine()) {
            System.err.print("ERROR: Enter the day %nProgram Terminating");
            return;
        } else {
            day = in.nextLine().toUpperCase();
        }

        System.out.print("Time (24h): ");
        if (!in.hasNextLine()) {
            System.err.print("ERROR: Enter the time %nProgram Terminating");
            return;
        } else {
            time = in.nextLine();
        }
        
        System.out.print("Student (y/n): ");
        if (!in.hasNextLine()) {
            System.err.printf("ERROR: Enter y or n %nProgram Terminating");
            return;
        } else {
            student = in.nextLine().toUpperCase();
        }


        System.out.printf("%n%n--------------------------------------------------------%n");
        System.out.printf("Name:   %s", name);
        System.out.printf("Day:      ", day);
        System.out.printf("Time:     ", time);
        System.out.printf("%n%n--------------------------------------------------------%n");
        
        
        System.out.printf("%n%n--------------------------------------------------------%n");
        
        
        System.out.printf("%n%n--------------------------------------------------------%n");
    }
}
