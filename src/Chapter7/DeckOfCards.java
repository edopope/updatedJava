package Chapter7;

public class DeckOfCards {
    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.shuffle();
        for (int a = 1; a <= 52; a++) {
            System.out.printf("%19s", game.dealCard());
            if (a % 4 == 0) {
                System.out.println();

            }
        }
    }

}