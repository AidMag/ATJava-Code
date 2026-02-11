/*  
Aidan
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartA {
    public static int getQuizScore(Scanner in) {
        int score = 0;
        System.out.print("Enter a quiz score (0-100): ");
        try {
            score = in.nextInt();
            if (score < 0 || score > 100) {
                throw new NumberFormatException("Score must be within 0-100");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR: " + e.getMessage());
            return 0;
        } 
        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int score = getQuizScore(in);
            System.out.println("score = " + score);
        } catch (Exception e) {
            System.err.println("an error occurred!");
            System.out.println(e.getMessage());
        }
    }
}