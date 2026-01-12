/*
Aidan
*/

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        int counter = 0, counter_1 = 0;

        Scanner in = new Scanner(System.in);
        int[] values = new int[20];

        for(int i = 0;i<values.length;i++){
            System.out.print("Enter an integer or 'q' to quit: ");
        if (in.hasNext("q") || in.hasNext("Q")) {
            in.next();
            break;
        }
        values[i] = in.nextInt();
        counter++;
        }

        for (int j = 0; j < counter; j++) {
            System.out.print(values[j]);
            System.out.print(",");
        }

        System.out.print("Enter a target integer value: ");
        int target = in.nextInt();

        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                counter_1++;
            }
        }

        System.out.printf("%nThe value %d occurs %d times in your original data set.", target, counter_1);

        in.close();
    }
}
