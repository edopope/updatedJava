package Chapter7;
import java.security.SecureRandom;

public class CardGame {
    private static final SecureRandom random = new SecureRandom();
    private static final int NUMBERS_OF_CARDS = 52;

    private Cards[] deck = new Cards[NUMBERS_OF_CARDS];
    private int currentCard = 0;

    public CardGame() {
        String[] faces = {"ACE", "DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
        String[] suits = {"hearts", "Diamonds", "clubs", "spades"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Cards(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = random.nextInt(NUMBERS_OF_CARDS);
            Cards temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Cards dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;


        }
    }
}


