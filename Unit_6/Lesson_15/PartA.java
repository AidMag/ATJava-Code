/*
Write a program that uses a partially filled array to scan in integer values from the user.
The array should store a maximum of 10 values.
The user should type in 'q' to quit entering data. 
After data has been entered, print the elements on a single line that starts and ends with an asterisk ('*') and with each element separated by an asterisk.
Sort the data, and then print the elements in reverse numerical order, separating values with a comma (',').

For example, if the user entered the values 4, 3, 5, 2, and 0 as their integer values, your program should produce the following output,

*4*3*5*2*0*
5,4,3,2,0

Important Note: When using a partially filled array, you don't want to sort the entire array.  
You only want to sort the valid values of the partially filled array.  
You can use an overloaded version of Arrays.sort() that lets you sort a subset of the array.

For example, suppose I have an array called values that holds 10 integer values, but my current size is only equal to 5.  
Instead of sorting the entire array, I would only want to sort the first 5 elements of the array:

	Arrays.sort(values, 0, currentSize);

The preceding code sorts the array called values from the element at index equals 0 up to but not including the element at index equals currentSize.
*/



import java.util.Arrays;

public class PartA {

}