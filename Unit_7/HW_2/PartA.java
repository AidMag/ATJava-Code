import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartA {
   public static void main(String[] args) throws FileNotFoundException {
       File inputFile = new File("text/consumerdata.txt");
       Scanner in = new Scanner(inputFile);
       
       in.useDelimiter("[, \s\t\n]+");

       System.out.printf("-----------------------------------------%n");
       System.out.printf("  ID    |     NAME      |     BALANCE    %n");
       System.out.printf("-----------------------------------------%n");
    
       while (in.hasNext()) {
           if (in.hasNextInt()) {
               int val = in.nextInt();
               System.out.printf("%06d | ", val);
           } else if (in.hasNextDouble()) {
            double amount = in.nextDouble();
            System.out.printf("%6.2f %n", amount);
           } else if (in.hasNext()) {
            String word = in.next();
            System.out.printf("%10s | ",word);
           }
           
       }
       in.close();
   }
}