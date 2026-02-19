import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pratical {
    public static void main(String[] args){
        System.out.println("Name            | School              | Score");
        System.out.println("-------------------------------------------------");
        try {
            File input = new File("mathmeet.txt");
            Scanner in = new Scanner(input);
            double sum = 0, avg = 0;
            int count = 0;
            while (in.hasNextLine()) {
                in.useDelimiter("[,\n]+");
                String name = in.next();
                String school = in.next();
                in.useDelimiter("[, \n]+");
                Double score = in.nextDouble();
                System.out.printf("%12s   |%18s     |%.2f%n", name, school, score);
                sum += score;
                count++;
            }
            avg = sum / count;
            System.out.println("------------------------------------------------");
            System.out.printf("Average Score: %.2f", avg);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.print("ERROR: " + e.getMessage());
        }
    }
}
