package Inheritance_1.Irsyad;

public class Book {
    protected String title;
    protected String author;
    protected int price;
    protected int stockQuantity;

    public Book(String title, String author, int price, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }

    @Override
    public String toString() {
        return String.format("Judul : %s    Penulis : %s    Harga: Rp. %,d    Persediaan: %d Jilid",
                title, author, price, stockQuantity);
    }
}
