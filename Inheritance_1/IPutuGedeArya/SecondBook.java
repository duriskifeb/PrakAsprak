public class SecondBook extends Book {
    private int discountRate;
    private String seller;

    public SecondBook(String title, String author, int price, int stockQuantity, int discountRate, String seller) {
        super(title, author, price, stockQuantity);
        this.discountRate = discountRate;
        this.seller = seller;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public String getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTingkat diskon : " + discountRate + "% Penjual : " + seller;
    }
}