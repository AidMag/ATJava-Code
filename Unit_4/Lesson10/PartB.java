/*
 * Aidan
 * ERROR type: Compile Error
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        double discount = 0; // the variable was not inisilized so their was the possiblity that  
        if (num > 6) {       // if there is less the 6 cookies that discount would not have a value which is not allowed.
            discount = 0.05;
        } else if (num > 12) {
            discount = 0.10;
        }
        System.out.println("Discount = " + discount);
        
        in.close();
    }
}
