/*
Aidan
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int counter = 0;
        int lowest;
        
        while (true) {
            System.out.print("Enter a temperature or enter 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            } else {
                values.add(in.nextInt());
                counter++;
            }
        }
        lowest = values.get(0);
        for (int i = 1; i < counter; i++) {
            if (lowest > values.get(i)) {
                lowest = values.get(i);
            }
        }

        
        for (int j = 0; j < counter; j++) {
            System.out.printf("%n%d", values.get(j));
            if (values.get(j) == lowest) {
                System.out.print("<= Lowest");
            }
        }
        in.close();
    }
}
