/*
Aidan
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

        //loop
        while (score > 0){
            if (score > 0){
                n = n + 1;
                System.out.printf("%nEnter score %d: ", n);
                score = in.nextDouble();
                sum += score;
            }
        }
        
        //getting rid of negitive number then calculating average
        sum = sum - score;
        n = n - 1;
        average = sum /n;

        //printing out average
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
