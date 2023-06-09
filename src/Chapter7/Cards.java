package Chapter7;

public class Cards {
    private String face;
    private String suit;

    public Cards(String cardFace,String cardSuit ){
        this.face = cardFace;
        this.suit = cardSuit;
    }
    public String toString(){
        return face + "of" + suit;
    }




}

