import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;


/*
Write a Java program that opens this file called "quizzes.txt" for reading:
Open the file for reading
Open another file called "quizzesMod.txt" for writing
Read in the double values
Write each formatted value to the output file on a separate line as shown below
Calculate the average value of the quiz scores
Record the average value at the end of the file
Close both files when done

Your output file must be formatted as shown below in order to receive full credit:

Quiz 000: 100.00
Quiz 001:  90.00
Quiz 002:  80.00
Quiz 003:  70.00
Quiz 004: 110.00
Quiz 005: 120.00
Quiz 006:  60.00
Quiz 007:  80.00
Quiz 008:  90.00
Quiz 009: 100.00
----------------
Average:   90.00
*/

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        double sum = 0, avg = 0;
        int counter = 0;
        
        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("scoresFormatted.txt");
        PrintWriter out = new PrintWriter(outputFile);

        while (in.hasNext()) {
            double score = in.nextDouble();
            sum += score;
            counter++;
            System.out.printf("Quz %03d: ", counter);
            System.out.printf("%6.2f%n", score);
        }
        avg = sum / counter;

        System.out.print("-------------------");
        System.out.printf("%nAverage: %3.2f", avg);

        in.close();
        out.close();
    }
}
