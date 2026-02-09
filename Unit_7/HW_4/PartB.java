import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
The first field of each line is the name of the person
The second field is their birth year or "n/a" if the birth year is not available
Use Integer.parseInt() method to convert the birth year field from the file to an integer value
Use try-catch statement to handle the NumberFormatException
Print the name and their birth year if you were able to extract the birth year from the file
Print a message that you don't know the birth year for that person if you were unable to extract the birth year from the file
Your output should look like the following
Sal was born in 2006.
Darcy was born in 2000.
Kim was born in 2005.
I do not know what year Liz was born.
Bob was born in 1999.

*/

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("birthyears.txt");
        Scanner in = new Scanner(file);
    }
}