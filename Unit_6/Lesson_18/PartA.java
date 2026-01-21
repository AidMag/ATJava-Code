/*
Aidan
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
        } while (!word.equals("#"));
        values.remove(counter - 1);

        System.out.printf("%n%s", values);
        
        in.close();
    }
}