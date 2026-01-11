/*
create a method called insert() that takes a reference to an array of doubles, the current size of the partially filled array (as an integer), a target index value (as an integer), and a new value (as a double) as arguments.  
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
        if (targetIndex >= array.length || currentSize > array.length - 1 || targetIndex < 0) {
            //doesn't chang anything b/c the target index is outside the current size or larger than the array.
            return currentSize;
        }
        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }
        

        return currentSize;
    }

    public static int remove(double[] array, int currentSize, int targetIndex) {
        if (targetIndex >= currentSize || targetIndex >= array.length || currentSize > array.length - 1) {
            //doesn't chang anything
            // target indez is outsie the current size or larger than our array.
            return currentSize;
        }

        for (int i = targetIndex + 1; i > currentSize; i++) {
            array[targetIndex + 1] = array[targetIndex];
        }
        currentSize--;
        return currentSize;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[10];

        double sum = 0, max = 0, avg = 0, newElement;
        int counter, index;

        //Assigning values to the array and counter
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

        //finding the avg, max, and counter
        for (int j = 0; j < counter; j++) {
            sum += scores[j];
        }

        avg = sum / counter;

        //print count, average, and max.
        System.out.printf("Count: %d%nAverage: %.2f%nMax: %.2f%n", counter, avg, max);
        System.out.printf("----------------------------------------------------------------------%n");

        System.out.print("Enter the score you would like to remove (first: 1; second: 2 ect.): ");
        in.nextLine();
        in.nextLine();
        index = in.nextInt();

        counter = remove(scores, counter, index);

        System.out.print("Enter another score: ");
        in.next();
        in.next();
        in.next();
        newElement = in.nextDouble();

        insert(scores, counter, index, newElement);


        //finding the avg, max, and counter
        for (int j = 0; j < counter; j++) {
            sum += scores[j];
        }

        avg = sum / counter;

        System.out.printf("Count: %d%nAverage: %.2f%nMax: %.2f%n", counter, avg, max);

        in.close();
    }
}