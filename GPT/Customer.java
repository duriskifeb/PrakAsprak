package GPT;

public class Customer {
    private String name;
    private int totalPrice;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.totalPrice = 0; // Inisialisasi dengan 0
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Method beli buku biasa
    public void buyBook(Book book, int stockQuantity) {
        if (stockQuantity <= book.getStockQuantity()) {
            int totalPrice = book.getPrice() * stockQuantity;
            this.totalPrice += totalPrice;
            book.setStockQuantity(book.getStockQuantity() - stockQuantity);
        }
    }

    // Method beli buku SecondBook
    public void buyBook(SecondBook book) {
        int totalPrice = book.getPrice() - ((book.getDiscountRate() * book.getPrice()) / 100);
        this.totalPrice += totalPrice;
    }

    @Override
    public String toString() {
        return "Nama Pelanggan: " + name + ", Jumlah Total: " + totalPrice;
    }
}
