import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/Top5Unemployment.txt");
        Scanner in = new Scanner(file);
        

        System.out.printf("----------------------------------------------------------------------------%n");
        System.out.printf("                          TOP 5 UNEMPLOYMENT RATES                          %n");
        System.out.printf("----------------------------------------------------------------------------%n");

        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\n]+");
            String name = lineScanner.next().trim();
            String nextWord = lineScanner.next().trim();
            double percentage = Double.valueOf(nextWord);
            nextWord = lineScanner.next().trim();
            int rank = Integer.valueOf(nextWord);
            String region = lineScanner.next().trim();

            System.out.printf("Ranked #%3d: %16s | %6.2f%% | %s%n", rank, name, percentage, region);
        }
       System.out.printf("----------------------------------------------------------------------------%n");

       in.close();
    }
}