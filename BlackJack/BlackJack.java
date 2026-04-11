import game.deck.Card;
import java.util.ArrayList;
import java.util.Scanner;

/*
The program should automatically track each player's score.
The rank of a numeric card (2 through 10) is added to a player's score.
Jacks, queens, and kings add 10 points each to a player's score.
Aces count as 11 unless the player's score is a bust.  
If the player's score exceeds 21, and the player has one or more ace, then the code should loop through the aces
For each iteration the code should change the value of the current ace to 1 (from 11) and then recalculate the score.
If the score is now <= 21 the code should exit the ace loop.
Otherwise the code should loop to the next ace and repeat the process until the score goes to 21 or lower, or until all of the aces have been converted.
If the dealer has a 21 but the player does not, then the player loses.  
Note that in a real casino if the dealer has a 10 or a face card (A, K, Q, or J) showing, the dealer will check the second card to determine if the dealer has 21.
The dealer will reveal the face of the second card if the dealer has a score of 21.
If the player has a 21, but the dealer does not, then the player wins (and wins 1.5 times the amount of their bet).
If both the dealer and the player have 21's, then it's a draw and no one wins.
After the initial cards have been dealt, it is the player's turn:
The game should loop and ask the user if they want to hit (i.e., receive another random card) or stand (end their turn and not receive any more cards).
The program should recalculate the player's score after each card is dealt.
If the player's score exceeds 21 the player loses and the hand is over.
If the player stands, then the player's turn ends.
If the player doesn't go over 21, then it is the dealer's turn:
The dealer's second card should get turned over to real it's suit and rank.
The dealer must always hit (take a card) until their card is >= 17.
When the dealer's turn is over, the game should determine who won:
If the player has  a higher score than the dealer and does not exceed 21, then the player wins (and the player keeps their bet and also wins the amount they betted).
If the dealer has a higher score than the player and does not exceed 21, then the dealer wins (and the player loses their bet).
If the dealer and the player have the same score, then it's a draw and no one wins (and the player keeps their bet amount).
After a hand is over, the user should have the option to quit the game or to play another hand.
For your game, assume that the dealer draws from an infinite (and NOT limited) number of card decks.  
*/

public class BlackJack {
    
    public static void delay(long msec) {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {

        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Card> player = new ArrayList<>();
        ArrayList<Card> dealer = new ArrayList<>();

        dealer.add(new Card());
        dealer.add(new Card());
        player.add(new Card());
        player.add(new Card());

        System.out.println(dealer.get(0).getFace() + " ##");
        System.out.println(player.get(0).getFace() + " " + player.get(1).getFace());

        
        while (true) {

            String choice = in.nextLine().trim().toLowerCase();

            if (choice.equals("h")){
                
            } else if (choice.equals("s")) {
                
            } else if (choice.equals("q")) {
                in.close();
                break;
            } else {
                throw new IllegalArgumentException("Incorrect input: Please use the commands proved.");
            }
        }
        in.close();
    }
}