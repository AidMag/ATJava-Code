import mow.*;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the hieght of the yard: ");
        int h = in.nextInt();
        System.out.print("Enter the width of the yard: ");
        int w = in.nextInt();

        Yard lawn = new Yard(h, w);
        Mower mower = new Mower();
        mower.startPostition(lawn);

        in.close();

        System.out.println();
        lawn.print(mower);

        
            while (mower.updateMower(lawn)) {
                mower.cut(lawn);
                if (mower.check(lawn) == 'R'||mower.check(lawn) == ' ') {
                    mower.turn_r();
                } else {
                    mower.move();
                }
                Yard.clearScreen();
                lawn.print(mower);
                Mower.delay(500); 
            }
    }
}
