/*
Aidan
Compare how long it takes to search for an integer using the linear search method when compared to using the binary search method.
 - consistently takes teh binary search longer to find the value.
You should create a test loop that generates multiple (I did 10) random target values and time how long it takes to conduct a linear search and a binary search for each target value.
 - look at the version before the current one to find my loop of the two.
What happens if you increase the size from 10,000 to 10,000,000?
 - The linear search takes just slightly longer when the number is increased.
*/


import java.util.Arrays;
import java.util.Scanner;

public class PartC {
    
    public static int linearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }

    public static int B_search(int[] array, int tgtVal) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, tgtVal);
    }
    
    public static void main(String[] args) {
        int counter = 0, tgt;
        double time_linear, time_binary;
        long startTime, startTime1, endTime, endTime1; 

        Scanner in = new Scanner(System.in);
        int[] values = new int[10000];

        for (int i = 0; i < values.length; i++) {
            values[i] = (int) ((Math.random() * 10000) + 1);
            counter++;
        }
        
        System.out.print("Enter a integer 1-10,000: ");
        tgt = in.nextInt();
        
        for (int i = 0; i < 11; i++) {
            startTime = System.nanoTime();
            time_linear = linearSearch(values, tgt);
            endTime = System.nanoTime();

            double time = endTime - startTime;

            System.out.printf("Linear Search took %.2f nanoseconds %n", time);
            System.out.printf("Index: %.2f%n", time_linear);

            startTime1 = System.nanoTime();
            time_binary = B_search(values, tgt);
            endTime1 = System.nanoTime();

            time = endTime1 - startTime1;

            System.out.printf("Binary Search took %.2f nanoseconds %n", time);
            System.out.printf("Index: %.2f%n", time_binary);
        }

        in.close();
    }
}
