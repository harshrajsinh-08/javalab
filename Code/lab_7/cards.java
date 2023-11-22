package lab_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class cards {
    public static void main(String[] args) {
        int numHands = 4;
        int cardsPerHand = 5;

        List<String> suits = List.of("Spades", "Hearts", "Diamonds", "Clubs");
        List<String> ranks = List.of("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");

        List<String> deck = generateDeck(suits, ranks);
        shuffleDeck(deck);

        List<List<String>> hands = dealHands(deck, numHands, cardsPerHand);

        for (int i = 0; i < numHands; i++) {
            System.out.println("Hand " + (i + 1) + ": " + hands.get(i));
        }
    }

    public static List<String> generateDeck(List<String> suits, List<String> ranks) {
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }

    public static void shuffleDeck(List<String> deck) {
        long seed = 0;
        Collections.shuffle(deck, new Random(seed));
    }

    public static List<List<String>> dealHands(List<String> deck, int numHands, int cardsPerHand) {
        List<List<String>> hands = new ArrayList<>();

        for (int i = 0; i < numHands; i++) {
            List<String> hand = new ArrayList<>();
            for (int j = 0; j < cardsPerHand; j++) {
                hand.add(deck.remove(0));
            }
            hands.add(hand);
        }
        return hands;
    }
}
