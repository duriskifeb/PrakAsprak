public class Main {
    public static void main(String[] args) {
        // ini buat manggil Book menggunakan variable boook
        Book[] books = new Book[4];
        Book book1 = new Book("sesuaikan ", "asprak", 1000, 5);
        books[0] = book1;
        Book book2 = new Book("sesuaikan ", "asprak", 1000, 5);
        books[1] = book2;
        Book book3 = new Book("sesuaikan ", "asprak", 1000, 5);
        books[2] = book3;
        Book book4 = new Book("sesuaikan ", "asprak", 1000, 5);
        books[3] = book4;

        // ini buat manggil secouBook
        SecoundBook[] secoundBooks = new SecoundBook[10];
        secoundBooks[0] = new SecoundBook("sesuain yang di modul", "asprak", 1000, "HAKIM", 20);
        secoundBooks[1] = new SecoundBook("sesuain yang di modul", "asprak", 1000, "HAKIM", 20);

        Customer[] customer = new Customer[2];
        customer[0] = new Customer("Hakim"); 
        customer[1] = new Customer("Hakim"); 

        // // BUAT PROSES PEMBAYARAN
        customer[0].buyBook(books[0], 3);
        
        customer[1].buyBook(secoundBooks[0], 5);
        customer[1].buyBook(secoundBooks[1], 5);
        // customer[1].buyBook(secoundBooks[3], 5);

        if (secoundBooks[3] != null) {
            customer[1].buyBook(secoundBooks[3]);
        }

        // buat print Book
        System.out.println("daftar buku : ");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        // buat print seccoundBook
        System.out.println("Daftar buku Secound : ");
        for (SecoundBook book : secoundBooks) {
            if (book != null) {
                System.out.println(book);
            }
        }
        System.out.println();

        // buat print informasi customer
        System.out.println("informasi pelanggan buku : ");
        for (Customer customers : customer) {
            System.out.println(customers);
        }
    }
}
