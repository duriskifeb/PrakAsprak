package Inheritance_1.Irsyad;

public class SecondBook extends Book {
    private String seller;
    private int discountRate;

    public SecondBook(String title, String author, int price, int stockQuantity, String seller, int discountRate) {
        super(title, author, price, stockQuantity);
        this.seller = seller;
        this.discountRate = discountRate;
    }

    public int getDiscountRate() { return discountRate; }

    @Override
    public String toString() {
        return String.format("Judul : %s    Penulis : %s    Harga: Rp. %,d    Persediaan: %d Jilid    Tingkat diskon : %d%%    Penjual : %s",
                title, author, price, stockQuantity, discountRate, seller);
    }
}
