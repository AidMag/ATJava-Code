/*
Aidan

Does the average value make sense? Explain.
    The average makes sense becuase when it was the average of ten times the average was generally staying around 5 with very little divation.
Then when it loop 1000 time the average stayed closer to 5.
This is becuase 5 is the exact mid point of 1 through 10 so the averages make sense that they are close to it.
 */

public class PartC {
    public static void main(String[] args) {
        
        
        int i;
        int num_random;
        double sum = 0;
        double average;

        for (i = 1; i <= 10; i++){ // change the comparison to i to change the number of times the loop loops
                num_random = (int)(Math.random() * 11);
                sum += num_random;
        }
        
        average = sum / i;
        System.out.printf("The average of ten random numbers are %.2f", average);
        
        
    }
}
