import Inheritance_1.*;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15),
            new Book("Pistol, Kuman dan Besi", "Jared Diamond", 28000, 3),
            new Book("Street of Dark Shops", "Patrick Modiano", 11000, 12),
            new Book("Perjalanan Mr. Cuffe menuju kebahagiaan", "François Leroy", 13500, 1)
        };

        SecoundBook[] SecoundBook = {
            new SecoundBook("Penjelajahan warisan budaya Penulis", "Yoo Hong-Jun", 13000, 1, "IU", 45),
            new SecoundBook("Cerita pendek Tolstoy", "Tolstoy", 16000, 1, "Kim Soo-hyun", 40)
        };

        Customer[] customers = {
            new Customer("Na Gong-Bu"),
            new Customer("Kim Sin-ip")
        };

        System.out.println("------------------------------------------------------------");
        System.out.println("-- Informasi Buku --");
        for (Book book : books) {
            System.out.println(book);
        }
        for (SecoundBook secondBook : SecoundBook) {
            System.out.println(secondBook);
        }
        System.out.println("------------------------------------------------------------");

        customers[0].buyBook(books[2], 3);
        customers[0].buyBook(SecoundBook[1]);
        customers[0].buyBook(books[0], 1);
        customers[0].buyBook(books[3], 1);
        customers[1].buyBook(SecoundBook[1]);
        customers[1].buyBook(books[1], 3);

        System.out.println("------------------------------------------------------------");
        System.out.println("-- Informasi Buku Setelah Pembelian --");
        for (Book book : books) {
            System.out.println(book);
        }
        for (SecoundBook secondBook : SecoundBook) {
            System.out.println(secondBook);
        }
        System.out.println("------------------------------------------------------------");

        System.out.println("-- Informasi Pelanggan --");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("------------------------------------------------------------");
    }
}
