package mystuff;

public class Random {
    public static int getRandomInteger(int num) {
        int random = (int) ((Math.random() * num) + 1);
        return random;
    }
}
