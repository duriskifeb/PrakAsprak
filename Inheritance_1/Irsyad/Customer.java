package Inheritance_1.Irsyad;

public class Customer {
    private String name;
    private int totalPrice;

    public Customer(String name) {
        this.name = name;
        this.totalPrice = 0;
    }

    public String getName() { return name; }
    public int getTotalPrice() { return totalPrice; }

    public void buyBook(Book book, int quantity) {
        if (book.getStockQuantity() >= quantity) {
            int cost = book.getPrice() * quantity;
            totalPrice += cost;
            book.setStockQuantity(book.getStockQuantity() - quantity);
            System.out.printf("Anda telah membeli %s. Jumlah total : Rp. %,d%n", book.getTitle(), cost);
        } else {
            System.out.println("[Error] Persediaannya kurang. Jumlah persediaan saat ini : " + book.getStockQuantity() + " jilid");
        }
    }

    public void buyBook(SecondBook book) {
        if (book.getStockQuantity() > 0) {
            int discount = (book.getPrice() * book.getDiscountRate()) / 100;
            int finalPrice = book.getPrice() - discount;
            totalPrice += finalPrice;
            book.setStockQuantity(book.getStockQuantity() - 1);
            System.out.printf("Anda telah membeli %s. Jumlah total : Rp. %,d%n", book.getTitle(), finalPrice);
        } else {
            System.out.println("[Error] Oplid Kurang, tidak dapat di beli.");
        }
    }

    @Override
    public String toString() {
        return String.format("Nama Pelanggan : %s    Jumlah total : Rp. %,d", name, totalPrice);
    }
}
