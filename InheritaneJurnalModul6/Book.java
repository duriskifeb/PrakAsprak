package InheritaneJurnalModul6;

public class Book {
    private String title, author;
    private int price, stock;
    
    //buat construktor nya dlu
    public Book (String title, String author, int price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Judul : " + title + " Penulis : " + author + " Harga : Rp." + price + " Persediaan : " + stock;
    }
}
