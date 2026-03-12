package mow;

/*
Have a member variable that is reference to a 2D array of characters that represents the lawn:
The red bricks in the boundary of the lawn are represented by the character 'R'.
The unmowed units within the lawn are represented by the plus character '+'.
The mowed units within the lawn are represented by the space character ' '.


Initialize the newly created array with '+' symbols to represent the unmowed grass and 'R' symbols to represent the red brick boundaries.
Provide a method that takes two integer arguments that represent the row and column within the yard and returns the value of the character in that cell of the 2D array:
Returns an 'R' if the cell represents a red brick
Returns a '+' if the cell is an unmowed unit of lawn
Returns a ' ' if the cell is a mowed unit of lawn
Provide method that takes two integer arguments that represent the row and column within the lawn, and a character that represents the new value for that cell in the lawn
Cell gets overwritten with the new value.
Will be used to "mow" that spot of the lawn.
Provide a method that returns the height of the lawn (which does not include the two red brick borders at the top and bottom of the yard).
Provide a method that returns the width of the lawn (which does not include the two red brick borders on the left and right of the yard).
Provide a method that prints the current state of the lawn to standard output
If a cell contains a red brick border, it should appear as the character 'R'.
If a cell contains an unmowed spot of lawn, it should appear as the character '+'.
If a cell contains a mowed spot of lawn, it should appear as a blank space ' '.
*/

public class Yard {
    private String[][] lawn = new String[1][1];
    
    public Yard(int r, int c) {
        lawn = new String[r+2][c+2];
        for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                
            }
        }
    }
}
