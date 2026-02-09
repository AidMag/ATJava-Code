import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/*
Write a program that asks the user to specify the name of a text file for reading:
Ask the user to specify a filename or the # character to quit.
If the user types in the # character, say goodbye and quit the program run
If a file is found with that name, open the file for reading.
Display each word on its own line on the computer screen.
Close the file when you are finished reading from it.
End the program run
If the file is not found, display an error message to the user
Let the user know that the file was not found.
Repeat the process to get the file name (specify a filename or the # character to quit).
*/

public class PartA {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        String string = null;
        Scanner in;

       
            System.out.print("Enter your text file name or '#' to quit (file for reading is message.txt): ");
            string = input.next();
            if (string.equals("#")) {
                System.out.println("Goodbye");
                input.close();
                return;
            }
            try {
                File file = new File(string);
            } catch (Exception e) {
                System.err.println("ERROR: " + e.getMessage());
            }    
        
        try {
            in = new Scanner(string);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            return;
        }

        while (in.hasNextLine()) {
            String currentLine = in.next();
            System.out.println(currentLine);
        }

        in.close();
        
    }
}
