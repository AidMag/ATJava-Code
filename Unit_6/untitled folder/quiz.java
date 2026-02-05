import java.util.Scanner;
import java.util.ArrayList;


public class quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        double sum = 0, avg = 0;
        int counter = 0;

        do{
            System.out.print("Enter a quiz score or 'q' to quit: ");
            if (in.hasNext("q")||in.hasNext("Q")){
                break;
            } else {
                scores.add(in.nextDouble());
                counter++;
            }
        } while (true);

        System.out.println("-------------------------");
        for (int i = 0; i < counter; i++) {
            System.out.printf("%7.2f%n", scores.get(i));
        }
        System.out.println("-------------------------");
        
        for (int i = 0; i < counter; i++) {
            sum += scores.get(i);
        }

        avg = sum / counter;

        System.out.printf("avg = %.2f", avg);

        in.close();
    }
}
