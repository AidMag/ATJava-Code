public class Recursion {
    
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negitive integer.");
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void printInverted(int n) {
        if (n == 1 || n == 0) {
            System.out.print("* ");
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negitive integer.");
        } else {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
            printInverted(n - 1);
        }
        System.out.println();
    }

    public static void printTriangle(int n) {
        if (n == 1 || n == 0) {
            System.out.print("* ");
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negitive integer.");
        } else {
            printTriangle(n - 1);
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

        }
    }

   
    public static void main(String[] args) {
        printInverted(5);
        printTriangle(5);
    }

}