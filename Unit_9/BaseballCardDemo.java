import Lesson_31.BaseballCard;

public class BaseballCardDemo {
    public static void main(String[] args) {
        BaseballCard a = new BaseballCard("Player_1", 2019);
        BaseballCard b = new BaseballCard("Player_1", 2019);

        System.out.println(a);
        System.out.println(b);

        if (a.equals(b)) {
            System.out.println("There are duplicate entries.");
        } else {
            System.out.println("There are NO duplicate entries.");
        }

    }
}
