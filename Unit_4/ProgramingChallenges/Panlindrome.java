/*
A palindrome is a word or phrase that reads the same forwards and backwards. 
The following words are examples of palindromes,

madam
kayak
mom
dad

Write a program that prompts the user for a word or phrase and then uses a loop to check whether or not the word or phrase is a palindrome.

*/

import java.util.Scanner;

public class Panlindrome {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        while (true) {
            String input = " ", word = " ", reverse = " ";
            int length;

            do {
                System.out.printf("%nEnter a word: ");
            } while (input.toLowerCase().matches("[a-z]+"));

            word = in.nextLine().toLowerCase().trim();
            length = word.length();

            for (int i = length - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            if (!reverse.equals(word)) {
                System.out.printf("%s is a panlindrome.", word);
            } else {
                System.out.printf("%s is not a panlindrome.%n", word);
            }
            in.close();
        }
    }
}