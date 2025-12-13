//Aidan

import java.util.Scanner;

public class PartB {

    public static double smallest(double x, double y, double z) {
        
        double small;
        
        if (x <= y && x <= z) {
            small = x;
        } else if (y <= x && y <= z) {
            small = y;
        } else {
            small = z;
        }

        return small;
    }



    public static void main(String[] args) {

        double num_1=1, num_2=1, num_3=1;
        
        Scanner in = new Scanner(System.in);
        
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter a number: ");

            if (i == 1) {
                num_1 = in.nextDouble();
            } else if (i == 2) {
                num_2 = in.nextDouble();
            } else {
                num_3 = in.nextDouble();
            }
        }
        
        in.close();

        System.out.print("The smallest number is " + smallest(num_1, num_2, num_3));
    }
}