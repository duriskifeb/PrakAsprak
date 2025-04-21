import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi buku
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15));
        books.add(new Book("Pistol, kuman dan Besi", "Jared Diamond", 28000, 3));
        books.add(new Book("Street of Dark Shops", "Patrick Modiano", 11000, 12));
        books.add(new Book("Perjalanan Mr. Cuffe menuju kebahagiaan", "François Leroy", 13500, 1)); // Stok 1 jilid

        ArrayList<SecondBook> secondBooks = new ArrayList<>();
        secondBooks.add(new SecondBook("Penjelajah warisan budaya", "Yoo Hong-Jun", 13000, 1, 45, "IU"));
        secondBooks.add(new SecondBook("Cerita pendek Tolstoy", "Tolstoy", 16000, 1, 40, "Kim Soo-hyun"));

        // Inisialisasi pelanggan
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("NaGongBu"));
        customers.add(new Customer("Kim Shin lp"));

        // Tampilkan informasi buku awal
        System.out.println("------");
        System.out.println("--informasi buku--");
        System.out.println("------");
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
        for (SecondBook secondBook : secondBooks) {
            System.out.println(secondBook);
            System.out.println();
        }

        Customer naGongBu = customers.get(0);
        Customer kimShinLp = customers.get(1);

        // Proses pembelian
        naGongBu.buyBook(books.get(2), 3);  // Beli "Street of Dark Shops" (3 jilid)
        naGongBu.buyBook(books.get(1), 0);  // Error: jumlah kurang
        naGongBu.buyBook(secondBooks.get(1), 1);  // Beli "Cerita pendek Tolstoy" (1 jilid)
        naGongBu.buyBook(books.get(0), 1);  // Beli "Apa itu keadilan?" (1 jilid)
        kimShinLp.buyBook(secondBooks.get(1), 1);  // Error: stok kurang
        kimShinLp.buyBook(books.get(3), 2);  // Error: stok kurang (hanya 1 jilid tersedia)
        kimShinLp.buyBook(books.get(1), 3);  // Beli "Pistol, kuman dan Besi" (3 jilid)

        // Tampilkan informasi buku setelah pembelian
        System.out.println("------");
        System.out.println("--informasi buku--");
        System.out.println("------");
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
        for (SecondBook secondBook : secondBooks) {
            System.out.println(secondBook);
            System.out.println();
        }

        // Tampilkan informasi pembelian pelanggan
        System.out.println("------");
        System.out.println("--informasi pembelian--");
        System.out.println("------");
        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.println();
        }
    }
}