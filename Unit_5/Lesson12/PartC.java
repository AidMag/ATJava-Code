/*
Write a method (and a program to test the method) called countVowels() that takes a String called phrase as its argument,
This method should count all of the vowels in the argument called phrase and return this count as an integer value.  
Note that vowels are the letters a, e, i, o, and u, and their uppercase variants. 
Also write a helper method called isVowel() that checks whether a character is a vowel.
 */

import java.util.Scanner;

public class PartC {

    public static int countVowels(String phrase) {
        int counter = 0;
        
        for (int i = phrase.length() - 1; i >= 0; i--) {
            if (String.valueOf(phrase.charAt(i)).matches("[aieuoAIEUO]")) {
                counter++;
            }
        }
        return counter;
    }

    
    public static void main(String[] args) {
        
        String input;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        input = in.nextLine();
        System.out.print("There are " + countVowels(input) + " vowels in your phrase.");

        in.close();
    }
}
