package GPT;

public class SecondBook extends Book {
    private String seller;
    private int discountRate;

    // Constructor
    public SecondBook(String title, String author, int price, String seller, int discountRate) {
        super(title, author, price, 0);
        this.seller = seller;
        this.discountRate = discountRate;
    }

    // Getter
    public int getDiscountRate() {
        return discountRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seller: " + seller + ", Discount: " + discountRate + "%";
    }
}
