package game.deck;
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
            case 1: a = Suit.SPADE; break;
            case 2: a = Suit.HEART; break;
            case 3: a = Suit.CLUB; break;
            case 4: a = Suit.DIAMOND; break;
        }

        switch (rank) {
            case 1: b = Rank.TWO; break;
            case 2: b = Rank.THREE; break;
            case 3: b = Rank.FOUR; break;
            case 4: b = Rank.FIVE; break;
            case 5: b = Rank.SIX; break;
            case 6: b = Rank.SEVEN; break;
            case 7: b = Rank.EIGHT; break;
            case 8: b = Rank.NINE; break;
            case 9: b = Rank.TEN; break;
            case 10: b = Rank.JACK; break;
            case 11: b = Rank.QUEEN; break;
            case 12: b = Rank.KING; break;
            case 13: b = Rank.ACE; break;
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

    public int getValue() {
        switch (b) {
            case TWO: return 2;
            case THREE: return 3; 
            case FOUR: return 4; 
            case FIVE: return 5; 
            case SIX: return 6; 
            case SEVEN: return 7; 
            case EIGHT: return 8; 
            case NINE: return 9; 
            case TEN: return 10; 
            case JACK: return 10; 
            case QUEEN: return 10; 
            case KING: return 10; 
            case ACE: return 11 ; 
            default: return 0; 
        }
    }
   
    public String getFace() {
        char s;
        char r;

        switch (b) {
            case TWO: r = '2'; break;
            case THREE: r = '3'; break;
            case FOUR: r = '4'; break;
            case FIVE: r = '5'; break;
            case SIX: r = '6'; break;
            case SEVEN: r = '7'; break;
            case EIGHT: r = '8'; break;
            case NINE: r = '9'; break;
            case TEN: r = 'T'; break;
            case JACK: r = 'J'; break;
            case QUEEN: r = 'Q'; break;
            case KING: r = 'K'; break;
            case ACE: r = 'A'; break;
            default: r = 'N'; break;
        }

        switch (a) {
            case SPADE: s = '\u2660'; break;
            case CLUB: s = '\u2663'; break;
            case DIAMOND: s = '\u2662'; break;
            case HEART: s = '\u2661'; break;
            default: s = '?'; break;
        }

        return "" + s + r;
    }
    
    public static void main(String[] args) {
        Card a = new Card(Card.Rank.QUEEN, Card.Suit.CLUB);

        System.out.println("First Card is a Queen of Clubs: " + a.getFace());

        for (int i = 0; i < 11; i++) {
            Card b = new Card();
            System.out.println(b.getFace());
        }
    }
}