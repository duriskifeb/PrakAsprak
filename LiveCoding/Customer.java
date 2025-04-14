package LiveCoding;

public class Customer {
    private String name;
    private int total;

    //constructor
    public Customer(String name) {
        this.name = name;
        this.total = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getTotal() {
        return total;
    }

    // buat methode inheritance nya di sini 
    //ini yang book
    public void buyBoook(Book book, int quantity) {
        if (quantity <= book.getStock()) {
            int totalPrice = book.getPrice() * quantity;
            total += totalPrice;
            book.setStock(book.getStock() - quantity);
        }
    }

    // ini yang SecoundBook
    public void buyBoook(SecoundBook book, int quantity) {
        if (quantity <= book.getStock()) {
            int totalPrice = book.getPrice() * quantity;
            total += totalPrice;
            book.setStock(book.getStock() - quantity);
        }
    }

    @Override
    public String toString() {
        return "nama pelanggan : " + name + " Jumlah Total : Rp. " + total;
    }
    



    



}
