import java.util.Scanner;

public class Palindromes {

    public static boolean isPali(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0, j = s.length() - 1;
        for (int a = s.length() / 2; a > 0; a--) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalr(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalr(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Palindromes check = new Palindromes();

        System.out.print("Enter a word: ");
        String word = in.nextLine();
        
        if (isPalr(word)){
            System.out.println(word + " is a palindrome (recersive)");
        } else {
            System.out.println(word + " is not a palindrome (recersive)");
        }

        if (isPali(word)){
            System.out.println(word + " is a palindrome (iteritive)");
        } else {
            System.out.println(word + " is not a palindrome (iteritive)");
        }


        in.close();
    }
}