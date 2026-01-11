/*
Modify your program that you created that from the previous assignment (the one that calculates a test average using a partially partially filled array) and create a method called insert() that takes a reference to an array of doubles, the current size of the partially filled array (as an integer), a target index value (as an integer), and a new value (as a double) as arguments.  
If there is available space, the method inserts the new double value into the array at the target index for the array, preserving the existing order.  
The method should return the updated current size of the array:
The method should preserve the order of the array.
Current size represents the number of valid elements in the array.
Your method should check to make sure that the target index is within the bounds of the partially filled array.  
If it is not, the method should not alter anything and should return  the existing current size of the partially filled array.

Your method declaration would look something like the following,

public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {

}

Your program should demonstrate the use of this function.

*/

import java.util.Scanner;

public class PartB {

    public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[10];

        double sum = 0, max = 0;
        int counter, j;

        for (counter = 0; counter < scores.length; counter++) {
            System.out.print("Enter Test Score: ");
            if (!in.hasNextDouble()) {
                break;
            }
            scores[counter] = in.nextDouble();
            if (scores[counter] > max) {
                max = scores[counter];
            }
        }
        
        for (j = 0; j < counter; j++) {
            sum += scores[j];
        }
        
        double avg = sum / counter; 

        //print count, average, and max.
        System.out.printf("Count: %d%nAverage: %.2f%nMax: %.2f%n", counter, avg, max);

        in.close();
    }
}