/*
Write a program that asks the user for an integer and checks to determine whether or not the function is prime.
*/

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        
        int num, i;
    

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        num = in.nextInt();


        for (i = 1; i <= num; i++) {
            double l = num % i;
            if (l == 0) {
                System.out.print("This number is not prime");
                break;
            } else {
                continue;
            }
        }
        

        if (i == num && num != 1) {
            System.out.print("This number is prime");
        }
        
        in.close();
    }
}
