import mow.Yard;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the hieght of the yard: ");
        int h = in.nextInt();
        System.out.print("Enter the width of the yard: ");
        int w = in.nextInt();

        Yard lawn = new Yard(h, w);
        
        System.out.println();
        lawn.print();
        
        in.close();
    }
}
