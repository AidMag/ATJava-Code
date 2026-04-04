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

        System.out.print("Enter which direction the spiral should go ((R)ight or (L)eft): ");
        String direction = in.next().toLowerCase();
        in.close();

        System.out.println();
        lawn.print(mower);

        if (direction.equals("r")) {
            while (true) {
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
        } else if (direction.equals("l")) {
            while (true) {
                mower.cut(lawn);
                if (mower.check(lawn) == 'R'||mower.check(lawn) == ' ') {
                    mower.turn_l();
                } else {
                    mower.move();
                }
                Yard.clearScreen();
                lawn.print(mower);
                Mower.delay(500);
            }
        }
    }
}
