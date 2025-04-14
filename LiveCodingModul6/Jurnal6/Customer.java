public class Customer {
    private String name;
    private int totalPrice;

    // panggil constructor 
    public Customer(String name) {
        this.name = name;
        this.totalPrice = 0;
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
    
    // method buy boook 
    public void buyBook(Book book, int stockQuantity) {
        if (stockQuantity <= book.getStockQuantity()) {
            int totalPrice = book.getPrice() * stockQuantity;
            this.totalPrice += totalPrice;
            book.setStockQuantity(book.getStockQuantity() - stockQuantity);
        }
    } 
    
    // method buy SecoundBoook 
    public void buyBook(SecoundBook book) {
        int totalPrice = book.getPrice() - (book.getDiscountRate() * book.getPrice());
        this.totalPrice += totalPrice;
    }

    // toString 
    @Override
    public String toString() {
        return "Nama Pelanggan : " + name + " Jumlah Total : " + totalPrice;
    }
}
