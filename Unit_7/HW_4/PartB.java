import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
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
        in.useDelimiter("[, \\s]+");
        String word, unknown;
        int age;

        while (in.hasNext()) {
            word = in.next();
            try {
                age = in.nextInt();
                System.out.printf("%s was born in %d%n", word, age);
            } catch (Exception e) {
                in.next();
                unknown = "I don't know what year";
                System.out.printf("%s %s was born.%n", unknown, word);
            }
       }
    }
}