package Chandra;

public class User {

    private String nama;
    private String userID;
    private String userType;
    private Book[] borrowedBooks;
    private int limitPinjam;
    private int durasiPinjam;

    public User(String nama, String userID) {
        this.nama = nama;
        this.userID = userID;
        this.userType = "Anggota Lainnya ";
        this.limitPinjam = 3;
        this.durasiPinjam = 7;
        this.borrowedBooks = new Book[this.limitPinjam];
    }

    public User(String nama, String userID, String userType) {
        this.nama = nama;
        this.userID = userID;
        this.userType = userType;

        if (this.userType.equalsIgnoreCase("mahasiswa")) {
            limitPinjam = 5;
            durasiPinjam = 14;
        } else if (this.userType.equalsIgnoreCase("dosen")) {
            limitPinjam = 10;
            durasiPinjam = 30;
        } else {
            this.userType = "Anggota Lainnya ";
            limitPinjam = 3;
            durasiPinjam = 7;
        }
        this.borrowedBooks = new Book[this.limitPinjam];
    }

    public boolean dapatPinjam() {
        for (int i = 0; i < this.limitPinjam; i++) {
            if (this.borrowedBooks[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void tambahkanBukuPinjam(Book buku) {
        for (int i = 0; i < this.borrowedBooks.length; i++) {
            if (this.borrowedBooks[i] == null) {
                this.borrowedBooks[i] = buku;
                System.out.println("Berhasil meminjam buku ");
                return;
            }
        }
    }

    public void displayBukuPinjaman() {
        System.out.println("Buku yang dipinjam : ");
        for (int i = 0; i < this.borrowedBooks.length; i++) {
            if (this.borrowedBooks[i] != null) {
                System.out.println(this.borrowedBooks[i].getTittle());
                break;
            }else {
                System.out.println("Buku tidak ada / Sedang di pinjam");
                break;
            }
        }
    }

    public String getUserID() {
        return this.userID;
    }

    public String UserType() {
        return this.userType;
    }
}
