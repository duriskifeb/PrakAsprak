package Modul11;

public class BookBiz implements IBookBiz {
    private Book[] books;

    public BookBiz(Book[] books) {
        this.books = books;
    }

    @Override
    public void printAllBooks() {
        printNovelHeader();
        boolean adaNovel = false;
        for (Book book : books) {
            if (book instanceof Novel) {
                System.out.println(book);
                adaNovel = true;
            }
        }
        if (!adaNovel)
            System.out.println("Tidak ada novel.");
        System.out.println();

        printMagazineHeader();
        boolean adaMagazine = false;
        for (Book book : books) {
            if (book instanceof Magazine) {
                System.out.println(book);
                adaMagazine = true;
            }
        }
        if (!adaMagazine)
            System.out.println("Tidak ada majalah.");
        System.out.println();
    }

    @Override
    public void searchNovelByAuthor(String author) {
        printNovelHeader();
        boolean found = false;
        for (Book book : books) {
            if (book instanceof Novel) {
                Novel n = (Novel) book;
                if (n.getAuthor().equalsIgnoreCase(author.trim())) {
                    System.out.println(n);
                    found = true;
                }
            }
        }
        if (!found)
            System.out.println("Novel tidak ditemukan.");
        System.out.println();
    }

    @Override
    public void searchNovelByPrice(int minPrice, int maxPrice) {
        printNovelHeader();
        boolean found = false;
        for (Book book : books) {
            if (book instanceof Novel) {
                Novel n = (Novel) book;
                if (n.getPrice() >= minPrice && n.getPrice() <= maxPrice) {
                    System.out.println(n);
                    found = true;
                }
            }
        }
        if (!found)
            System.out.println("Novel tidak ditemukan.");
        System.out.println();
    }

    private void printNovelHeader() {
        System.out.println("== Daftar Novel ==");
        System.out.println("Penulis      | Judul                |     Harga");
        System.out.println("-----------------------------------------------");
    }

    private void printMagazineHeader() {
        System.out.println("== Daftar Majalah ==");
        System.out.println("Kategori        | Judul                |     Harga   | [Deskripsi]");
        System.out.println("---------------------------------------------------------------");
    }
}