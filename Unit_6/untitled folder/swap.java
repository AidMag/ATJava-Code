import java.util.Arrays;
public class swap {
    public static void swap(int a, int b, int[] array) {
        if (a < array.length && b <= array.length && a > -1 && b > -1) {
            int val = array[a];
            array[a] = array[b];
            array[b] = val;   
        }
    }
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        swap(2, 7, numbers);
        System.out.println(Arrays.toString(numbers));
    }
}