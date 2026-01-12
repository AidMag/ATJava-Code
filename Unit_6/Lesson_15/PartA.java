/*
Aidan
*/

import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        int counter = 0;

        Scanner in = new Scanner(System.in);
        int[] values = new int[10];

        for(int i = 0;i<values.length;i++){
            System.out.print("Enter an integer: ");
        if (in.hasNext("q") || in.hasNext("Q")) {
            in.next();
            break;
        }
        values[i] = in.nextInt();
        counter++;
        }

        for(int j = 0;j < counter;j++){
            System.out.print("*");
            System.out.print(values[j]);
        }
        System.out.println("*");

        Arrays.sort(values, 0, counter);

        for (int k = 0; k < counter; k++) {
            System.out.print(values[counter - 1 - k]);
            System.out.print(",");
        }
        in.close();
    }
}