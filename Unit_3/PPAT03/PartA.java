import java.util.Scanner;

/*
Day of week as text (e.g., monday, fri, case-insensitive)
Time entered in HH:MM format (using 24-hour notation)
Age is an integer ≥ 0  Note:
If the age of the passenger is equal to 100, set the cost to $666 and do not apply any discounts 
Use a boolean value (true or false) to track the passenger's student status.


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
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Day: ");
        String day = in.nextLine().toUpperCase();
        System.out.print("Time (24h): ");//Figure out a solution to the colon
        System.out.print("Student (y/n): ");
        String student = in.nextLine().toLowerCase();

        System.out.printf("%n%n--------------------------------------------------------%n");
        System.out.printf("Name:   %s", name);
        System.out.printf("Day: ");


    }
}
