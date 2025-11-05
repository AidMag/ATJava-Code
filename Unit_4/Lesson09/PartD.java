/*
Aidan
 */

import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String input;
        int num = 0;

        while (true){
            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            input = in.nextLine().toUpperCase();

            if (input.equals("R")){
                num = (int)(Math.random() * 7);
            } else if (input.equals("D")){
                if (num == 1){
                    System.out.printf("+-------+ %n|       | %n|   0   | %n|       | %n+-------+ %n");
                } else if (num == 2){
                    System.out.printf("+-------+ %n| 0     | %n|       | %n|     0 | %n+-------+ %n");
                } else if (num == 3){
                    System.out.printf("+-------+ %n| 0     | %n|   0   | %n|     0 | %n+-------+ %n");
                } else if (num == 4){
                    System.out.printf("+-------+ %n| 0   0 | %n|       | %n| 0   0 | %n+-------+ %n");
                } else if (num == 5){
                    System.out.printf("+-------+ %n| 0   0 | %n|   0   | %n| 0   0 | %n+-------+ %n");
                } else if (num == 6){
                    System.out.printf("+-------+ %n| 0   0 | %n| 0   0 | %n| 0   0 | %n+-------+ %n");
                }
            } else if (input.equals("Q")){
                break;
            }
        }

        in.close();
    }
}
