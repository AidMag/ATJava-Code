import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB {
   public static void main(String[] args) throws FileNotFoundException {
       File inputFile = new File("text/characters.txt");
       Scanner in = new Scanner(inputFile);
       in.useDelimiter(" ");  
       int count = 0, letter = 0, digits = 0;

       while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                count++;

                if (Character.isLetter(ch)) {
                    letter++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                }
            }
        }
    
       
       System.out.printf("count: %d%nletters: %d%ndigits: %d%n", count, letter, digits);
       in.close();
   }
}