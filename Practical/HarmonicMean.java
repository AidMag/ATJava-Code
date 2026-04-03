import org.derryfield.math.Alegebra;
import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Alegebra a = new Alegebra();

        System.out.print("Enter a positive double: ");
        double x = in.nextDouble();
        System.out.println();
        System.out.print("Enter a positive double: ");
        double y = in.nextDouble();
        System.out.println();

        System.out.print("The Harmonic Mean is " + Alegebra.harmonic_mean(x, y));
        
        in.close();
    }
}
