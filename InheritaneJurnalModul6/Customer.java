package InheritaneJurnalModul6;

public class Customer {
    private String name;
    private int totalPurchase;

    //buat constructor dulu 
    public Customer(String name) {
        this.name = name;
        this.totalPurchase = 0;
    }

    //di get sama set dlu 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPurchase() {
        return totalPurchase;
    }

    //method overload dari method buku  
    public void buyBook(Book book, int quantity) {
        if (quantity <= book.getStock()) {
            int totalPrice = book.getPrice() * quantity;
            totalPurchase += totalPrice;
            book.setStock(book.getStock() - quantity);
        }
    }

    // overload merhod dari SecoundBook
    public void buyBook(SecoundBook book, int quantity) {
        if (quantity <= book.getStock()) {
            int totalPrice = book.getPrice() * quantity;
            totalPurchase += totalPrice;
            book.setStock(book.getStock() - quantity);
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Nama Pelanggan : " + name + " Jumlah Total : Rp. " + totalPurchase;
    }
}
