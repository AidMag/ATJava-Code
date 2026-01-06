import java.util.Scanner;

public class testscores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[10];

        double sum = 0, max = 0;
        int i, j;

        for (i = 0; i < 10; i++) {
            System.out.print("Enter Test Score: ");
            if (!in.hasNextDouble()) {
                break;
            }
            scores[i] = in.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        
        for (j = 0; j < i; j++) {
            sum += scores[j];
        }
        
        double avg = sum / i; 

        //print count, average, and max.
        System.out.printf("Count: %d%nAverage: %.2f%nMax: %.2f%n", i, avg, max);

        in.close();
    }
}
