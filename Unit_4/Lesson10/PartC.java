/*
 * Aidan
 */

 import java.util.Scanner;
  
 public class PartC {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
 
         // Prompt user for name.
         System.out.print("Enter student name: ");
         String name = in.nextLine();
 
         // Initialize variables to be used to find the total points,
         // and the min and max values.
         int total = 0;
         int min = 0;
         int max = -1; 
         final int COUNT = 4;
         boolean first = true; // boolean for min and max
 
         // loop count times to obtain the test scores for the student.
         for (int i = 1; i <= COUNT; i++) {
             System.out.print("Enter score " + i + " (0-100): ");
             int s = in.nextInt();
 
             // Validate input.
             // Only scores from 0 to 100 are allowed.
             // If a score is less than zero, force it to be equal to zero.
             // If a score is greater than 100, force it to be equal to 100.
             
             // s cannot be both greater and less than zero simultaniously.
             /* if (s < 0 && s > 100) {
                 if (s < 0)
                     s = 0;
                 if (s > 100)
                     s = 100;
             } */

             if (s < 0) {
                 s = 0;
             } else if (s > 100) {
                 s = 100;
             }
 
             // Track min/max
             /*There needs to be an exeption for the first time so that the min and max will be based off of the inputs.
             Also forgot brackets and the second condition should an else statement.
             
             if (s < min) {
                min = s;
             } else if (s > max) {
               max = s; 
             }  */ 
             
             if (first) {
                first = false;
                min = s;
                max = s;
             }  
             if (s < min) {
                min = s;
             } else if (s > max) {
               max = s; 
             } 

             // add up the total.
             total += s;
         }
 
         // calculate average.
         //double avg = (double) (total / COUNT);--This is just going to add decimal places not keep more info
         double avg = ((double)total)/ COUNT;
 
         // Did the student pass?
         boolean passed = false;
         if (avg >= 60) { // there is not supose to be a ';' after the if statement
             passed = true;
         }
 
         // Assign letter grade
         char letter = 'F';
         if (avg >= 90) {
             letter = 'A';
         } else if (avg >= 80) {
             letter = 'B';
         } else if (avg >= 70) {
             letter = 'C';
         } else if (avg >= 60) {
             letter = 'D';
         } else {
             letter = 'F';
         }
 
         // print summary
         System.out.println("\n----- Report -----");
         System.out.println("Name: " + name);
         System.out.println("Highest single score recorded: " + max);
         System.out.println("Lowest single score recorded: " + min);
         System.out.println("Passed? " + passed);
         System.out.printf("Average: %.2f%n", avg);// it should be %n not \n for a formated print statement.
         System.out.println("Letter grade: " + letter);
 
         // close the Scanner object before exiting.
         in.close();
     }
 } 