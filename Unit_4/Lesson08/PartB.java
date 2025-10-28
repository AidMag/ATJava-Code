/*
Aidan
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
