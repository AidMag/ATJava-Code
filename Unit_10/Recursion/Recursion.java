public class Recursion {
    
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be a nonnegitive integer.");
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
       System.out.printf("3! = %d%n", factorial(3));
       System.out.printf("4! = %d%n", factorial(4));
       System.out.printf("5! = %d%n", factorial(5));
   }

}