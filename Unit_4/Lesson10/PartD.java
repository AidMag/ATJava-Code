/*
 * Aidan
Write a program that uses a nested for loop to produce the following output.
....1
...22
..333
.4444
55555

 */

public class PartD {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(".");
            }

            for (k = 1; k <= 5; k++){
                System.out.print(i);
            }

        }
        
        
    }
}
