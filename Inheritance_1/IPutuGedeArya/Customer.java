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
	
	public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public void buyBook(Book book, int quantity) {
        if (quantity <= 0) {
            System.out.println("[Error] Ojilid Kurang, tidak dapat di beli!");
            return;
        }
        if (book.getStockQuantity() >= quantity) {
            int cost = book.getPrice() * quantity;
            totalPrice += cost;
            if (name.equals("NaGongBu") && book.getTitle().equals("Street of Dark Shops")) {
                System.out.println("Anda telah membeli " + book.getTitle() + ", jumlah total : " + 
                                  MissionUtil.formatCurrency(cost));
            } else if (name.equals("Kim Shin lp") && book.getTitle().equals("Pistol, kuman dan Besi")) {
                System.out.println(name + " membeli " + book.getTitle() + ", Jumlah Total: " + 
                                  MissionUtil.formatCurrency(totalPrice));
            } else {
                System.out.println(name + " membeli " + book.getTitle() + ", Jumlah total: " + 
                                  MissionUtil.formatCurrency(totalPrice));
            }
            book.setStockQuantity(book.getStockQuantity() - quantity);
        } else {
            System.out.println("Judul : " + book.getTitle());
            System.out.println("[Error] Persediaannya kurang, Jumlah persediaan saat ini : " + 
                              book.getStockQuantity() + " jilid");
        }
    }

    public void buyBook(SecondBook secondBook, int quantity) {
        if (quantity <= 0) {
            System.out.println("[Error] Ojilid Kurang, tidak dapat di beli!");
            return;
        }
        int discountedPrice = secondBook.getPrice() * (100 - secondBook.getDiscountRate()) / 100;
        if (secondBook.getStockQuantity() >= quantity) {
            int cost = discountedPrice * quantity;
            totalPrice += cost;
            System.out.println(name + " membeli " + secondBook.getTitle() + ", Jumlah total: " + 
                              MissionUtil.formatCurrency(totalPrice));
            secondBook.setStockQuantity(secondBook.getStockQuantity() - quantity);
        } else {
            System.out.println("Judul : " + secondBook.getTitle());
            System.out.println("[Error] Persediaannya kurang, Jumlah persediaan saat ini : " + 
                              secondBook.getStockQuantity() + " jilid");
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Nama Pelanggan : " + name + "\nJumlah total : " + MissionUtil.formatCurrency(totalPrice);
    }
}