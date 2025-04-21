package Inheritance_1.Irsyad;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15),
            new Book("Pistol, kuman dan Besi", "Jared Diamond", 28000, 3),
            new Book("Street of Dark Shops", "Patrick Modiano", 11000, 12),
            new Book("Perjalanan Mr. Cuffe menuju kebahagiaan", "Francois Leroy", 13500, 1)
        };

        SecondBook[] secondBooks = {
            new SecondBook("Penjelajah warisan budaya Penulis", "Yoo Hong-Jun", 13000, 1, "IU", 45),
            new SecondBook("Cerita pendek Tolstoy", "Tolstoy", 16000, 1, "Kim So-hyun", 40)
        };

        Customer[] customers = {
            new Customer("Na Gong-Bu"),
            new Customer("Kim Sin-ip")
        };

        System.out.println("--Informasi buku--");
        for (Book book : books) System.out.println(book);
        for (SecondBook book : secondBooks) System.out.println(book);
        System.out.println("--------------------------------------------------");

        customers[0].buyBook(books[2], 3);
        customers[0].buyBook(secondBooks[1]);
        customers[0].buyBook(books[0], 1);

        customers[1].buyBook(secondBooks[1]);
        customers[1].buyBook(books[3], 2);
        customers[1].buyBook(books[1], 3);

        System.out.println("\n--Informasi buku setelah pembelian--");
        for (Book book : books) System.out.println(book);
        for (SecondBook book : secondBooks) System.out.println(book);
        System.out.println("--------------------------------------------------");

        System.out.println("\n--Informasi pembelian--");
        for (Customer customer : customers) System.out.println(customer);
    }
}
