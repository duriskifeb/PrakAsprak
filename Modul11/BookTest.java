package Modul11;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
                new Novel("Laskar Pelangi", 100000, "Andrea Hirata"),
                new Magazine("Bobo", 20000, "Anak-anak", "Majalah anak-anak terbaik"),
                new Novel("Negeri 5 Menara", 90000, "Ahmad Fuadi"),
                new Magazine("National Geographic", 50000, "Edukasi", "Majalah edukasi alam & sains")
        };
        BookBiz biz = new BookBiz(books);

        System.out.println("========================================");
        System.out.println("*        Program Informasi Buku         *");
        System.out.println("========================================");

        int pilihan;
        do {
            printMenu();
            System.out.print("Masukkan nomor menu yang ingin dipilih : ");
            pilihan = getMenuInput();

            switch (pilihan) {
                case 1:
                    biz.printAllBooks();
                    break;
                case 2:
                    System.out.print("Masukkan nama penulis novel yang ingin dicari : ");
                    String author = MissionUtil.getStringInput();
                    biz.searchNovelByAuthor(author);
                    break;
                case 3:
                    int min = -1, max = -1;
                    do {
                        System.out.print("Masukkan harga minimum (tidak boleh negatif): ");
                        min = MissionUtil.getIntegerInput();
                        if (min < 0)
                            System.out.println("Nilai tidak valid, ulangi!");
                    } while (min < 0);
                    do {
                        System.out.print("Masukkan harga maksimum (tidak boleh negatif): ");
                        max = MissionUtil.getIntegerInput();
                        if (max < 0)
                            System.out.println("Nilai tidak valid, ulangi!");
                    } while (max < 0);
                    biz.searchNovelByPrice(min, max);
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia, silakan masukkan lagi!");
            }
        } while (pilihan != 4);

        System.out.println();
        System.out.println("Prodi S1 Rekayasa Perangkat Lunak, Semester Ganjil TA 2024/2025");
    }

    public static void printMenu() {
        System.out.println("Menu :");
        System.out.println("1. Tampilkan seluruh buku");
        System.out.println("2. Cari novel berdasarkan penulis");
        System.out.println("3. Cari novel berdasarkan rentang harga");
        System.out.println("4. Keluar");
    }

    public static int getMenuInput() {
        int input = -1;
        boolean valid = false;
        while (!valid) {
            input = MissionUtil.getIntegerInput();
            if (input >= 1 && input <= 4) {
                valid = true;
            } else {
                System.out.println("Pilihan anda tidak tersedia, silakan masukkan lagi!");
                System.out.print("Masukkan nomor menu yang ingin dipilih : ");
            }
        }
        return input;
    }
}