/*
Aidan
 */
import java.util.Scanner;

public class PartA {
    
    enum DAYSOFWEEK {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    public static void main(String[] args) {
        
        //Setting up Scanner
        Scanner in = new Scanner(System.in);

        //Declaring the variables
        int age;
        double cost;
        String day;

        //Getting values for variables
        System.out.print("Enter day of the week: ");
        day = in.nextLine().toUpperCase();
        System.out.print("Enter age of customer: ");
        age = in.nextInt();
        System.out.print("Enter cost of meal: ");
        cost = in.nextDouble();
        System.out.println("++++++++++++++++++++++++++++++++");
       
        //Determining cost of meal
        if (DAYSOFWEEK.MONDAY.toString().equals(day)) {
            if (age < 13){
                cost = cost * 0.925;
            } else if (age >= 50){
                cost = cost * 0.85;
            } else if (age > 13 && age <= 49){
                cost = cost * 0.95;
            }
        } else if (!DAYSOFWEEK.MONDAY.toString().equals(day)) {
            if (age < 13){
                cost = cost * 0.95;
            } else if (age >= 50){
                cost = cost * 0.925;
            } else if (age > 13 && age <= 49){ //something wrong here
                cost = cost;
            }
        }

        System.out.printf("Final cost: %.2f%n", cost);

        in.close();
    }
}