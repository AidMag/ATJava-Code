/*
Aidan
 */

import java.util.Scanner;

public class PartB {
     enum DAYSOFWEEK {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
     enum AGEGROUP {CHILD, ADULT, SENIOR};
    public static void main(String[] args) {
        
        //Setting up Scanner
        Scanner in = new Scanner(System.in);

        //Declaring the variables
        String age;
        double cost;
        String day;

        //Getting values for variables
        System.out.print("Enter day of the week: ");
        day = in.nextLine().toUpperCase();
        System.out.print("Enter age group of customer: ");
        age = in.nextLine().toUpperCase();
        System.out.print("Enter cost of meal: ");
        cost = in.nextDouble();
        System.out.println("++++++++++++++++++++++++++++++++");
       
        //Determining cost of meal
        if (DAYSOFWEEK.MONDAY.toString().equals(day)) {
            if (AGEGROUP.CHILD.toString().equals(age)){
                cost = cost * 0.925;
            } else if (AGEGROUP.SENIOR.toString().equals(age)){
                cost = cost * 0.85;
            } else if (AGEGROUP.ADULT.toString().equals(age)){
                cost = cost * 0.95;
            }
        } else if (!DAYSOFWEEK.MONDAY.toString().equals(day)) {
            if (AGEGROUP.CHILD.toString().equals(age)){
                cost = cost * 0.95;
            } else if (AGEGROUP.SENIOR.toString().equals(age)){
                cost = cost * 0.925;
            } else if (AGEGROUP.ADULT.toString().equals(age)){ 
                cost = cost;
            }
        }

        System.out.printf("Final cost: %.2f%n", cost);

        in.close();
    }
}
