/*
Write a program that asks the user to enter up to 20 integer values or 'q' to quit.  
Store the values in a partially filled array.  
Print the values of the partially filled array on a single line, separated by commas, for the user.  
Prompt the user for a single integer value.  
Count how many times the target integer value occurs in the original set of input data.

Important note: when you are processing the user input using your Scanner object, you should use a loop to keep scanning in data until the user types in a 'q' to quit entering data.  
You can detect if the user wants to quit using the hasNext function of the Scanner class.  
Make sure to skip over the 'q' in the input Scanner before you break from your input loop:

A portion of your loop code should look similar to the following,

            // prompt user for integer values:
            System.out.printf("Enter an integer value or 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next(); 	// skip over the 'q'
                break; 		// exit loop.
            } else {
Your program run should look something like the following,

Enter an integer value or 'q' to quit: 5
Enter an integer value or 'q' to quit: 1
Enter an integer value or 'q' to quit: 4
Enter an integer value or 'q' to quit: 1
Enter an integer value or 'q' to quit: 7
Enter an integer value or 'q' to quit: 1
Enter an integer value or 'q' to quit: q
5, 1, 4, 1, 7, 1
Enter a target integer value: 1
The value 1 occurs 3 times in your original data set.

*/


import java.util.Arrays;

public class PartB {
    
}
