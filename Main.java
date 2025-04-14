class Book {
    private String title, author;
    private int price, stockQuantity;

    // Constructor
    public Book(String title, String author, int price, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getter & Setter
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

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Judul: " + title + ", Penulis: " + author +
                ", Harga Rp. " + price + ", Persediaan: " + stockQuantity;
    }
}

class SecondBook extends Book {
    private String seller;
    private int discountRate;

    // Constructor
    public SecondBook(String title, String author, int price, String seller, int discountRate) {
        super(title, author, price, 0);
        this.seller = seller;
        this.discountRate = discountRate;
    }

    // Getter
    public int getDiscountRate() {
        return discountRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seller: " + seller + ", Discount: " + discountRate + "%";
    }
}

class Customer {
    private String name;
    private String totalPrice;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.totalPrice = "0"; // Inisialisasi dengan "0"
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Method beli buku biasa
    public void buyBook(Book book, int stockQuantity) {
        if (stockQuantity <= book.getStockQuantity()) {
            int totalPrice = book.getPrice() * stockQuantity;
            this.totalPrice = String.valueOf(Integer.parseInt(this.totalPrice) + totalPrice);
            book.setStockQuantity(book.getStockQuantity() - stockQuantity);
        }
    }

    // Method beli buku SecondBook
    public void buyBook(SecondBook book) {
        int totalPrice = book.getPrice() - ((book.getDiscountRate() * book.getPrice()) / 100);
        this.totalPrice = String.valueOf(Integer.parseInt(this.totalPrice) + totalPrice);
    }

    @Override
    public String toString() {
        return "Nama Pelanggan: " + name + ", Jumlah Total: " + totalPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        // Inisialisasi array Book
        Book[] books = new Book[4];
        books[0] = new Book("Modul A", "Asprak", 1000, 5);
        books[1] = new Book("Modul B", "Asprak", 1000, 5);
        books[2] = new Book("Modul C", "Asprak", 1000, 5);
        books[3] = new Book("Modul D", "Asprak", 1000, 5);

        // Inisialisasi array SecondBook
        SecondBook[] secondBooks = new SecondBook[10];
        secondBooks[0] = new SecondBook("Modul X", "Asprak", 1000, "Hakim", 20);
        secondBooks[1] = new SecondBook("Modul Y", "Asprak", 1000, "Hakim", 20);

        // Inisialisasi array Customer
        Customer[] customer = new Customer[2];
        customer[0] = new Customer("Hakim");
        customer[1] = new Customer("Ali");

        // Proses Pembelian Buku
        customer[0].buyBook(books[0], 3);
        customer[0].buyBook(books[1], 1);
        customer[0].buyBook(books[2], 0);
        customer[0].buyBook(books[3], 1);

        customer[1].buyBook(secondBooks[1]);
        customer[1].buyBook(secondBooks[1]);

        // Cek apakah secondBooks[3] tidak null sebelum mengaksesnya
        if (secondBooks[3] != null) {
            customer[1].buyBook(secondBooks[3]);
        }

        // Print daftar buku biasa
        System.out.println("Daftar Buku:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Print daftar SecondBook dengan pengecekan null
        System.out.println("Daftar Buku Second:");
        for (SecondBook book : secondBooks) {
            if (book != null) {
                System.out.println(book);
            }
        }

        // Print informasi pelanggan
        System.out.println("Informasi Pelanggan:");
        for (Customer customers : customer) {
            System.out.println(customers);
        }
    }
}
