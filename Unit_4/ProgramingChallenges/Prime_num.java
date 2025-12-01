/*
Aidan
*/

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        
        int num, i;
    

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        num = in.nextInt();


        for (i = 2; i <= num-1; i++) {
            double remander = num % i;
            if (remander == 0) {
                System.out.print("This number is not prime");
                break;
            } else {
                continue;
            }
        }
        

        if (i == num && num != 1) {
            System.out.print("This number is prime");
        }
        
        in.close();
    }
}
