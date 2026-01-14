/*
Write a program that uses a partially filled array of String objects to store a collection of words/phrases:
Scan in words/phrases from the user until the user enters 'q' to quit
Print the word/phrases in a neat manner for the user to review
Write a method called cleanup() that takes an array of String objects as its argument,
For each element of the array, trim any leading or trailing spaces.
Make all letters lowercase, except for the first letter in the word/phrase.
Capitalize the first letter of the word/phrase.
Use the method to alter the array and print the modified words/phrases 
A sample program run should look something like the following,

Enter a word or phrase or 'q' to quit: a
Enter a word or phrase or 'q' to quit:    bee  and   flower
Enter a word or phrase or 'q' to quit:    dog   
Enter a word or phrase or 'q' to quit: cats and dogs   
Enter a word or phrase or 'q' to quit: q
Words/Phrases (current size = 4):
  a
     bee  and   flower
     dog   
  cats and dogs   
Modified array...
Words/Phrases (current size = 4):
  A
  Bee  and   flower
  Dog
  Cats and dogs
*/


import java.util.Scanner;

public class PartA {
  
  public static void trimed(String[] phrase, int index) {
    for (int i = 0; i < index; i++) {
      phrase[i] = phrase[i].trim();
      phrase[i] = phrase[i].substring(0, 1).toUpperCase() + phrase[i].substring(1);
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] phrase = new String[10];
    int counter = 0;

    for (int i = 0; i < phrase.length; i++) {
      System.out.print("Enter a phrase or type 'q' to quit: ");
      if (in.hasNext("q") || in.hasNext("Q")) {
        in.next();
        break;
      } else {
        phrase[i] = in.nextLine();
        counter++;
      }
    }
    
    System.out.printf("%nWords/Phrases (current size = %d): %n", counter);
    for (int i = 0; i < counter; i++) {
      System.out.println(phrase[i]);
    }

    System.out.printf("%nModified array...");
    System.out.printf("%nWords/Phrases (current size = %d): %n", counter);
    
    trimed(phrase, counter);

    for (int i = 0; i < counter; i++) {
      System.out.println(phrase[i]);
    }

    in.close();
  }
}