import game.deck.Card;
import java.util.ArrayList;
import java.util.Scanner;

/*

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

    public static int calculateScore(ArrayList<Card> hand) {
        int score = 0;
        int aceCount = 0;

        for (Card card : hand) {
            score += card.getValue();

            if (card.getValue() == 11) {
                aceCount++;
            }
        }

        if (score > 21 && aceCount > 0) {
            for (int i = 0; i < aceCount; i++) {
                score -= 10;
                if (score < 21) {
                    break;
                }
            }
        }

        return score;
    }

    public static void printHand(ArrayList<Card> hand) {
        for (Card card : hand) {
            System.out.print(card.getFace() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Card> player = new ArrayList<>();
        ArrayList<Card> dealer = new ArrayList<>();

        int dealer_value;
        int player_value;

       while (true) {
        dealer.clear();
        player.clear();

        dealer.add(new Card());
        dealer.add(new Card());
        player.add(new Card());
        player.add(new Card());

        System.out.println(dealer.get(0).getFace() + " ##");
        System.out.println(player.get(0).getFace() + " " + player.get(1).getFace());


        while (true) {
            System.out.print("(h)it, (s)tay, or (q)uit: ");
            String choice = in.nextLine().trim().toLowerCase();

            if (choice.equals("h")) {
                player.add(new Card());

                System.out.print("Player: ");
                printHand(player);

                player_value = calculateScore(player);

                if (player_value > 21) {
                    System.out.println("Player busts! Dealer wins!");
                    break;
                }

            } else if (choice.equals("s")) {
                break;

            } else if (choice.equals("q")) {
                in.close();
                return;

            } else {
                System.out.println("Invalid input.");
            }
        }

        player_value = calculateScore(player);
        if (player_value <= 21) {
            System.out.println("Dealer's turn...");

            while (calculateScore(dealer) < 17) {
                delay(1000);
                dealer.add(new Card());
            }

            dealer_value = calculateScore(dealer);

            System.out.print("Dealer: ");
            printHand(dealer);

            System.out.print("Player: ");
            printHand(player);

            if (dealer_value > 21) {
                System.out.println("Dealer busts! Player wins!");
            } else if (dealer_value > player_value) {
                System.out.println("Dealer wins!");
            } else if (player_value > dealer_value) {
                System.out.println("Player wins!");
            } else {
                System.out.println("It's a draw!");
            }
        }

        System.out.print("Would you like to play again? (y/n): ");
        String again = in.nextLine().trim().toLowerCase();

        if (!again.equals("y")) {
            break;
        }
    }
    }
}