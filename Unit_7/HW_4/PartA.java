import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your text file name or '#' to quit (text file is message.txt): ");
            String filename = input.next();

            // Quit option
            if (filename.equals("#")) {
                System.out.println("Goodbye");
                break;
            }

            try {
                File file = new File(filename);
                Scanner fileScanner = new Scanner(file);

                while (fileScanner.hasNext()) {
                    System.out.println(fileScanner.next());
                }

                fileScanner.close();
                break; 

            } catch (FileNotFoundException e) {
                System.out.println("ERROR: " + e.toString());
                System.out.println("Please try again.\n");
            }
        }

        input.close();
    }
}
