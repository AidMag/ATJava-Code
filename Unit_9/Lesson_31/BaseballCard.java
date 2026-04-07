package Lesson_31;

public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return getClass().getName() + "[name = " + name + ", year = " + year + "]";
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof BaseballCard == false) {
            return false;
        }
        BaseballCard otherBaseballCard = (BaseballCard) obj;
        if (this.name.equals(otherBaseballCard.getName()) && this.year == otherBaseballCard.getYear()) {
            return true;
        } else {
            return false;
        }
    }
}