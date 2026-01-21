/*
Aidan
*/

import java.util.Scanner;
import java.util.ArrayList;

public class PartD {
   public static void main(String[] args) {
    ArrayList<Integer> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int counter = 0;
        
        while (true) {
            System.out.print("Enter a temperature or enter 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            } else {
                values.add(in.nextInt());
                counter++;
            }
        }

        for (int i = 0; i < counter; i++) {
            if (values.get(i) % 2 != 0) {
                values.remove(i);
                counter--;
                i--;
            } else {
                continue;
            }
        }

        
        for (int j = 0; j < counter; j++) {
            System.out.printf("%n%d", values.get(j));
        }
        in.close();
   } 
}
