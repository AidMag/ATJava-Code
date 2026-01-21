/*
Write a Java program that declares and initializes an ArrayList of Strings called names:  
Loop and ask the user for a name or the # symbol to quit
Add each name to the names ArrayList
After the names have been added to the list, print each name on a separate line
*/


import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int counter = 0;
        String word;
        
        do {
            System.out.print("Enter a name or enter '#' to quit: ");
            values.add(in.next());
            word = values.get(counter);
            counter++;
        } while (!word.equals("#") || !word.equals("#"));
        values.remove(counter);

        System.out.printf("%n%s", values);
        
        in.close();
    }
}