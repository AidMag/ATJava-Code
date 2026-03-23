import java.util.Scanner;
import mow.*;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the hieght of the yard: ");
        int h = in.nextInt();
        System.out.print("Enter the width of the yard: ");
        int w = in.nextInt();

        Yard lawn = new Yard(h, w);
        
        System.out.println();
        lawn.get(h / 2, 1);
        lawn.print();
        Yard.clearScreen();

        
        in.close();
    }
}
