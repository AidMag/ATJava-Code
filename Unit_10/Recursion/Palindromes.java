import java.util.Scanner;

public class Palindromes {
    public static void isPalr(String[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j < a.length; j++) {
                
            }
        }
    }

    public static void isPali(String[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j < a.length; j++) {
                
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Palindromes check = new Palindromes();

        System.out.print("Enter a word: ");
        String[] word = in.next().split("");
        
        check.isPalr(word);
        check.isPali(word);

        in.close();
    }
}