public class Card{
    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    private Suit a;
    private Rank b;
    
    public Card() {
        int suit = (int) ((Math.random() * 4) + 1);
        int rank = (int) ((Math.random() * 13) + 1);

        switch (suit) {
            case 1:
                a = Suit.SPADE;
                break;
            case 2:
                a = Suit.HEART;
                break;
            case 3:
                a = Suit.CLUB;
                break;
            case 4:
                a = Suit.DIAMOND;
                break;
        }

        switch (rank) {
            case 1:
                b = Rank.TWO;
                break;
            case 2:
                b = Rank.THREE;
                break;
            case 3:
                b = Rank.FOUR;
                break;
            case 4:
                b = Rank.FIVE;
                break;
            case 5:
                b = Rank.SIX;
                break;
            case 6:
                b = Rank.SEVEN;
                break;
            case 7:
                b = Rank.EIGHT;
                break;
            case 8:
                b = Rank.NINE;
                break;
            case 9:
                b = Rank.TEN;
                break;
            case 10:
                b = Rank.JACK;
                break;
            case 11:
                b = Rank.QUEEN;
                break;
            case 12:
                b = Rank.KING;
                break;
            case 13:
                b = Rank.ACE;
                break;
        }
    }
    
    public Card(Rank rank, Suit suit) {
        b = rank;
        a = suit;
    }

    public Suit getSuit() {
        return a;
    }
    
    public Rank getRank() {
        return b;
    }
    
    /*
    The Card class should have a public method called getFace() that returns a string that represents the face value of the card:
    The suit should be represented by a single unicode character:
        char spade   = '\u2660';    // ♠
        char heart   = '\u2661';    // ♡
        char club    = '\u2663';    // ♣
        char diamond = '\u2662';    // ♢
    The rank should be represented by a single character:
    '2' through '9' for rank TWO through NINE
    'T' for TEN
    'J' for JACK
    'Q' for QUEEN
    'K' for KING
    'A' for ACE
    For example, if a card is a HEART with a rank of TEN, the getFace() method should return the String "♡T".
    */
   
    public String getFace() {
        String face;
        
        if (a == Suit.SPADE) {

        }
        
        return face;
    }
}