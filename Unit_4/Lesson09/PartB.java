/*
Aidan
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        
        String phrase;
        int length;
        int i;
        int n = 0;
        char letter = 'E';

        //getting phrase
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        phrase = in.nextLine().toUpperCase();
        length = phrase.length();

        for (i = 0; i != length; i++){
            if (phrase.charAt(i) == letter){
                n = n + 1;
            }
        }

        System.out.printf("There are %d 'e' in your phrase!", n);

        in.close();
    }
}
