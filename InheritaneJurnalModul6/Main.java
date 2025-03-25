package InheritaneJurnalModul6;

public class Main {
    public static void main(String[] args) {

        //buat book array nya mas
        Book[] books = new Book[4];
        books[0] = new Book("Street of dark Shops", "Penulis A", 2000, 10);
        books[1] = new Book("Street of dark Shops", "Penulis A", 2000, 10);
        books[2] = new Book("Street of dark Shops", "Penulis A", 2000, 10);
        books[3] = new Book("Street of dark Shops", "Penulis A", 2000, 10);

        //buat secound book array nya mas
        SecoundBook[] secoundBooks = new SecoundBook[2];
        secoundBooks[0] = new SecoundBook("Sesuain aja dengan modul", "penulis", 2000, 7,"Bekas");
        secoundBooks[1] = new SecoundBook("Sesuain aja dengan modul", "penulis", 2000, 7,"Bekas");


        // buat customer array
        Customer[] customers = new Customer[2];
        customers[0] = new Customer("Sesuaikan Modul"); 
        customers[1] = new Customer("Sesuaikan Modul"); 

        //ini untuk pembayaran proses
        customers[0].buyBook(books[0], 3);
        customers[0].buyBook(books[1], 0);
        customers[0].buyBook(books[2], 1);
        customers[0].buyBook(books[3], 1);
        
        customers[1].buyBook(books[2], 1);
        customers[1].buyBook(secoundBooks [0], 2);
        customers[1].buyBook(books[1], 3);

        //print array nya disini ya 
        System.out.println("daftar buku : ");
        for(Book book : books) {
            System.out.println(book) ;
        }
        System.out.println();

        // print buat secound booknya
        System.out.println("Daftar Buku Bekas : ");
        for(SecoundBook book : secoundBooks) {
            System.out.println(book);
        }
        System.out.println();

        // print buat customernya 
        System.out.println("informasi pelanggan :");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println();

    }
}
