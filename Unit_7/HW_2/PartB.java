import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB {
   public static void main(String[] args) throws FileNotFoundException {
       File inputFile = new File("textfiles/poem.txt");
       Scanner in = new Scanner(inputFile);
       //in.useDelimiter("[^A-Za-z0-9]+");
       in.useDelimiter("[, \s\t\n]+"); // for HW 
       int count = 0;
       while (in.hasNext()) {
           String word = in.next();
           System.out.println(word);
           count++;
       }
       System.out.printf("%d words were scanned in.%n", count);
       in.close();
   }
}