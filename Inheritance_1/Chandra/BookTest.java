public class BookTest {
    public static void main(String[] args) {
        // Create array of Book objects
        Book[] books = new Book[4];
        books[0] = new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15);
        books[1] = new Book("Pistol, kuman dan Besi", "Jared Diamond", 28000, 3);
        books[2] = new Book("Street of Dark Shops", "Patrick Modiano", 11000, 12);
        books[3] = new Book("PERJALANAN Mr. Cuffe menuju kebahagiaan", "François Leroy", 13500, 1);

        // Create array of SecondBook objects
        SecondBook[] secondBooks = new SecondBook[2];
        secondBooks[0] = new SecondBook("PERJALANAN warisan budaya", "Yoo Hong-Jun", 13000, "IU", 45);
        secondBooks[1] = new SecondBook("Cerita pendek Tolstoy", "Tolstoy", 16000, "Kim Soo-hyun", 40);

        // Create array of Customer objects
        Customer[] customers = new Customer[2];
        customers[0] = new Customer("Na Gong-Bu");
        customers[1] = new Customer("Kim Sin-ip");

        // Print initial book information
        System.out.println("--informasi buku---------------------------------------------------------------------------------------------------------");
		System.out.println();
        for (Book book : books) {
            System.out.println(book);
        }
        for (SecondBook secondBook : secondBooks) {
            System.out.println(secondBook);
        }
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
        // Perform purchases for Na Gong-Bu
        System.out.println("\nAnda telah membeli Street of Dark Shops. Jumlah total : Rp." + (11000 * 3));
        customers[0].beliBuku(books[2], 3); // Street of Dark Shops, 3 jilid
        customers[0].beliBuku(books[1], 0); // Pistol, kuman dan Besi, 0 jilid (no error message)
        System.out.println("NaGongBu telah membeli Cerita Pendek Tolstoy. Jumlah total : Rp." + (16000 - (16000 * 40 / 100)));
        customers[0].beliBuku(secondBooks[1]); // Cerita pendek Tolstoy
        System.out.println("NaGongBu telah membeli Apa itu keadilan? Jumlah total : Rp." + 15000);
        customers[0].beliBuku(books[0], 1); // Apa itu keadilan?, 1 jilid

        // Perform purchases for Kim Sin-ip
        System.out.println("[ERROR] Persediaannya kurang. Jumlah persediaan saat ini : 0JILID");
        customers[1].beliBuku(secondBooks[1]); // Cerita pendek Tolstoy (already bought, stock 0)
        System.out.println("[ERROR] Persediaannya kurang. Jumlah persediaan saat ini : 1JILID");
        customers[1].beliBuku(books[3], 2); // Perjalanan Mr. Cuffe, 2 jilid (only 1 in stock)
        System.out.println("Kim Shin ip membeli Senjata, Kuman, dan Besi. Jumlah TOTAL : Rp." + (28000 * 3));
        customers[1].beliBuku(books[1], 3); // Pistol, kuman dan Besi, 3 jilid

        // Print updated book information
		System.out.println();
        System.out.println("--informasi buku---------------------------------------------------------------------------------------------------------");
        for (Book book : books) {
            System.out.println(book);
        }
        for (SecondBook secondBook : secondBooks) {
            System.out.println(secondBook);
        }
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println();

        // Print customer information
        System.out.println("--Informasi pembelian----------------------------------------------------------------------------------------------------");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }
}