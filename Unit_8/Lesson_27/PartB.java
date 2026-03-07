import org.derryfield.math.Geometry;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Geometry sqr = new Geometry();

        System.out.print("Enter the side length a square: ");
        double side = in.nextDouble();
        double p = sqr.get_perimeter_square(side);
        double a = sqr.get_area_square(side);

        System.out.printf("Perimeter: %.2f %nArea: %.2f", p, a);
        in.close();
    }
}
