import java.util.Scanner;

public class PartC {
    public static double vol(double r) {

        r = r * r * r * Math.PI * (4.0 / 3);

        return r;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r, vol;
     
        System.out.printf("%nEnter the radius of a circle: ");
        r = in.nextInt();

        vol = vol(r);

        System.out.printf("%.2f", vol);

        in.close();
    }
}
