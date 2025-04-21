public class SecoundBook extends Book {
    private String seller;
    private int discountRate;

    public SecoundBook(String title, String author, int price, int stockQuantity, String seller, int discountRate) {
        super(title, author, price, stockQuantity);
        this.seller = seller;
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    @Override
    public String toString() {
        int discountedPrice = getPrice() - (getPrice() * discountRate / 100);
        return String.format("Judul : %s\tPenulis : %s\tHarga : Rp. %,d\tPersediaan : %d jilid\tTingkat Diskon : %d%%\tPenjual : %s",
                getTitle(), getAuthor(), discountedPrice, getStockQuantity(), discountRate, seller);
    }
}
