package HMS;

public enum Type {
    EXECUTIVE(20000),
    REGULAR(15000),
    CHEAP(10000);

    private final int price;

    Type(int price) {
        this.price = price;
    }
}
