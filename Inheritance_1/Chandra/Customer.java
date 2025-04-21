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

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void beliBuku(Book book, int quantity) {
        if (quantity > 0 && book.getStockQuantity() < quantity) { 
            System.out.println("[ERROR] Persediaannya kurang. Jumlah persediaan saat ini : " + book.getStockQuantity() + "JILID");
        } else {
            book.setStockQuantity(book.getStockQuantity() - quantity);
            this.totalPrice += book.getPrice() * quantity;
        }
    }

    public void beliBuku(SecondBook book) {
        if (book.getStockQuantity() >= 1) {
            book.setStockQuantity(book.getStockQuantity() - 1);
            int discountedPrice = book.getPrice() - (book.getPrice() * book.getDiscountRate() / 100);
            this.totalPrice += discountedPrice;
        } else {
            System.out.println("[ERROR] Persediaannya kurang. Jumlah persediaan saat ini : " + book.getStockQuantity() + "JILID");
        }
    }

    @Override
    public String toString() {
        return "Nama Pelanggan : " + name + "\tJumlah total : " + MissionUtil.moneyFormat(totalPrice);
    }
}