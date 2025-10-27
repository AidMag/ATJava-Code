/*
Write a Java program that uses a for loop to calculate how much money a customer earns over five years:
Ask the user what the interest rate is (APR)
Ask the user what the initial balance amount is in dollars
Print a table that shows the year, interest amount, and balance on each row
You are not permitted to use AI (including ChatGPT) for this assignment, but you can work with your classmates.

Your program run should look something like the following,

Enter the APR (as a percentage, for example, 5.5): 6.5
Enter the balance: 1000
Year |        Int Earned ($)       |           Balance ($)
----------------------------------------------------------------------
  1  |                       65.00 |                      1,065.00    
  2  |                       69.23 |                      1,134.23    
  3  |                       73.72 |                      1,207.95    
  4  |                       78.52 |                      1,286.47    
  5  |                       83.62 |                      1,370.09



 */


import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double balance;
        int year;

        System.out.print("Enter the APR (as a percentage, for example, 5.5): ");
        double rate = in.nextDouble();
        System.out.print("Enter the balance: ");
        balance = in.nextDouble();

        in.close();

        System.out.println("Year |      Int Earned ($)     |      Balance ($)      ");
        System.out.print("--------------------------------------------------------");
        
        for (year = 1; year <= 5; year++ ) {
            double earned = (rate / 100) * balance;
            balance = balance * ((rate / 100) + 1);
            System.out.printf("%n   %d |                   %.2f |             %.2f%n", year , earned, balance);
        }
    }
}
