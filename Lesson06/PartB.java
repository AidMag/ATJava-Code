/*
 Fix the following section of code so that it will run properly.
 Submit your code as a Java source file for grading using MSA or GitHub.
// prompt user for age.
Scanner input = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = input.nextInt();

// are they lucky?
if (age = 13) {
System.out.println("Lucky 13!");
}

 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        // prompt user for age.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // are they lucky?
        if (age == 13) {
        System.out.println("Lucky 13!");
        }
        
        input.close();
    }
}