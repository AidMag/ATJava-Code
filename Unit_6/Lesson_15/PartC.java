/*
Write your own method that uses a linear search to determine whether an integer value is present in the array.  
Use this method to see if a target integer value is present in the array.
public static int linearSearch(int[] array, int tgtVal)
Use Arrays.binarySearch() to determine whether that same target integer value is present in the array.  
Remember, the binary search algorithm requires that the data be sorted in ascending order.
Use the System.nanoTime() method to time how long each method takes to search the array (in nanoseconds).
Compare how long it takes to search for an integer using the linear search method when compared to using the binary search method. 
You should create a test loop that generates multiple (I did 10) random target values and time how long it takes to conduct a linear search and a binary search for each target value.
Do you notice any difference when the size of the array is 10,000?
What happens if you increase the size from 10,000 to 10,000,000?
*/


import java.util.Arrays;
import java.util.Scanner;

public class PartC {
    
    public static int linearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) {
                return tgtVal;
            }
        } 
    }

    public static int B_search(int[] array, int tgtVal) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, tgtVal);
    }
    
    public static void main(String[] args) {
        int counter = 0;

        Scanner in = new Scanner(System.in);
        int[] values = new int[10000];

        for(int i = 0;i < values.length;i++){
        values[i] =(int)((Math.random()*10000)+1) ;
        counter++;
        }

        in.close();
    }
}
