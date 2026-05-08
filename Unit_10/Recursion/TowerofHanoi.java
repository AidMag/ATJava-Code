import java.util.Scanner;

public class TowerofHanoi {

    public static void hanoi(int n, int start, int end) {
        if (n == 1) {
            printMove(1, 3);
        } else {
            int other = 6 - (start + end);
            hanoi(n - 1, start, other);
            printMove(start, end);
            hanoi(n-1, other, end);
        }
    }
    
    
    public static void printMove(int start, int end) {
        System.out.println(start + " -> " + end);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TowerofHanoi a = new TowerofHanoi();

        System.out.print("Enter the number of disks: ");
        int disk = in.nextInt();

        System.out.printf("These are the optimal moves when there are %d disks.%n", disk);
        TowerofHanoi.hanoi(disk, 1, 3);

        in.close();
    }
}
