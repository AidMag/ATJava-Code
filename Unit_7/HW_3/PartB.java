import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/sales_by_cat.txt");
        Scanner in = new Scanner(file);


        //String nextWord = lineScanner.next().trim();
        //nextWord = nextWord.replaceAll(",", "");
        //double gdp = Double.valueOf(nextWord);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\n]+");
            String cat = lineScanner.next();
            String man = lineScanner.next();
            double cost;
            if (lineScanner.hasNextDouble()) {
                cost = lineScanner.nextDouble();
            } else {
                // skip over the "n/a"
                lineScanner.next();
                cost = 0.0;
            }
            System.out.printf("%-17s | %-10s | $%10.2f%n", cat, man, cost);
        }

    }
}
