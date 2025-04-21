public class Customer {
    private String name;
    private int totalPrice;

    public Customer(String name) {
        this.name = name;
        this.totalPrice = 0;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void buyBook(Book book, int quantity) {
        if (book.getStockQuantity() >= quantity) {
            int totalCost = book.getPrice() * quantity;
            totalPrice += totalCost;
            book.setStockQuantity(book.getStockQuantity() - quantity);
            System.out.printf("Anda telah membeli %s. Jumlah total: Rp. %,d\n", book.getTitle(), totalCost);
        } else {
            System.out.printf("[Error] Persediaannya kurang. Jumlah persediaan saat ini: %d jilid\n", book.getStockQuantity());
        }
    }

    public void buyBook(SecoundBook book) {
        if (book.getStockQuantity() > 0) {
            int discountedPrice = book.getPrice() - (book.getPrice() * book.getDiscountRate() / 100);
            totalPrice += discountedPrice;
            book.setStockQuantity(book.getStockQuantity() - 1);
            System.out.printf("%s telah membeli %s. Jumlah total: Rp. %,d\n", name, book.getTitle(), discountedPrice);
        } else {
            System.out.println("[Error] Oijild Kurang, tidak dapat dibeli.");
        }
    }

    public String toString() {
        return String.format("Nama Pelanggan: %s\tJumlah total: Rp. %,d", name, totalPrice);
    }
}
