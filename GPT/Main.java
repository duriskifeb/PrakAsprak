package GPT;

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
