/*
Write a program that simulates the rolling of two six sided dice:
Display the output of each dice roll to the user
Stop when the two dice have the same number
Bonus, can you display the output as ASCII art dice?

+-------+      +-------+
| O   O |      | O   O |
|   O   |      |   O   |
| O   O |      | O   O |
+-------+      +-------+

 */

import java.util.Scanner;

public class Dicerolling {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int num_one = 1, num_two = 0;

        while (num_one != num_two){

            num_one = (int)(Math.random() * 7);
            num_two = (int)(Math.random() * 7);
            
            if (num_one == 1){
                System.out.printf("+-------+ %n|       | %n|   0   | %n|       | %n+-------+ ");
            } else if (num_one == 2){
                System.out.printf("+-------+ %n| 0     | %n|       | %n|     0 | %n+-------+ ");
            } else if (num_one == 3){
                System.out.printf("+-------+ %n| 0     | %n|   0   | %n|     0 | %n+-------+ ");
            } else if (num_one == 4){
                System.out.printf("+-------+ %n| 0   0 | %n|       | %n| 0   0 | %n+-------+ ");
            } else if (num_one == 5){
                System.out.printf("+-------+ %n| 0   0 | %n|   0   | %n| 0   0 | %n+-------+ ");
            } else if (num_one == 6){
                System.out.printf("+-------+ %n| 0   0 | %n| 0   0 | %n| 0   0 | %n+-------+ ");
            }

            if (num_two == 1){
                System.out.printf(" +-------+  %n|       |  %n|   0   |  %n|       |  %n+-------+");
            } else if (num_two == 2){
                System.out.printf(" +-------+  %n| 0     |  %n|       |  %n|     0 |  %n+-------+");
            } else if (num_two == 3){
                System.out.printf(" +-------+  %n| 0     |  %n|   0   |  %n|     0 |  %n+-------+");
            } else if (num_two == 4){
                System.out.printf(" +-------+  %n| 0   0 |  %n|       |  %n| 0   0 |  %n+-------+");
            } else if (num_two == 5){
                System.out.printf(" +-------+  %n| 0   0 |  %n|   0   |  %n| 0   0 |  %n+-------+");
            } else if (num_two == 6){
                System.out.printf(" +-------+  %n| 0   0 |  %n| 0   0 |  %n| 0   0 |  %n+-------+");
            }
            System.out.println(" ");
        in.close();
    }
}
}