/*
Write a program to calculate and display a student's test average:
Print instructions for the user on how to enter data before looping.
Use a loop to get test scores from user
Assume user enters double values only (no need to do input validation)
User enters a negative number to quit entering data
After the data has been entered, print results:
Print the number of scores that were entered (not including the negative number)
Print the average test score
 */

import java.util.Scanner;

public class PartA {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter each score as a double. When you have entered all your scores enter a negitive number. ");
        
        int n = 0;
        double average = 0.0;
        double score = 1;
        double sum = 0.0;


        while (score > 0){
            if (score > 0){
                n = n + 1;
                System.out.printf("%nEnter score %d: ", n);
                score = in.nextDouble();
                sum += score;
            }
        }
        
        sum = sum - score;
        n = n - 1;
        average = sum /n;

        if (n > 0) {
            System.out.printf("You averaged %.2f in %d tests!", average, n);
        } else {
            System.err.println("No valid scores were entered.");
            in.close();
            return;
        }
        
        in.close();
   } 
}
