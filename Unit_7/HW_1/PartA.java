import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> temps = new ArrayList<>();
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);

        int counter = 0;

        while (in.hasNext()) {
            temps.add(in.nextInt());
            counter++;
        }

        double min = temps.get(0);

        for (int i = 0; i < counter; i++) {
            if (temps.get(i) < min) {
                min = temps.get(i);
            }
        }
        for (int i = 0; i < counter; i++) {
            if (temps.get(i) == min) {
                System.out.println(temps.get(i) + " <= lowest");
            } else {
                System.out.println(temps.get(i));
            }
        }

        in.close();
    }
}