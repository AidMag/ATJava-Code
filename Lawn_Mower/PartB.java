import java.util.Scanner;
import mow.*;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the hieght of the yard: ");
        int h = in.nextInt();
        System.out.print("Enter the width of the yard: ");
        int w = in.nextInt();
        System.out.print("Enter the coorinates of the lawn mower: ");
        int r = in.nextInt();
        int c = in.nextInt();
        System.out.print("Enter orientation of the mower: ");
        int o = in.nextInt();

        Yard lawn = new Yard(h, w);
        Mower mower = new Mower(r, c, o);
        
        System.out.println();
        lawn.print(mower);
        
        while (mower.check(lawn) != 'R') {
            mower.cut(lawn);
            mower.move();
            Yard.clearScreen();
            lawn.print(mower);
            Mower.delay(500);
        }

        in.close();
    }
}
