public class SecondBook extends Book {
    private String seller;
    private int discountRate;

    public SecondBook(String title, String author, int price, String seller, int discountRate) {
        super(title, author, price, 1); // stockQuantity is always 1 for SecondBook
        this.seller = seller;
        this.discountRate = discountRate;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\tTINGKAT DISKON : " + discountRate + "%\tPENJUAL : " + seller;
    }
}