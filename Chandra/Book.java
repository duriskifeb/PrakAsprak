package Chandra;

public class Book {

    private String Tittle;
    private String Author;
    private String ISBN;
    private boolean Available;
    private String[] ReservationQueue;

    public Book(String Tittle, String Author, String ISBN) {
        this.Tittle = Tittle;
        this.Author = Author;
        this.ISBN = ISBN;

        this.Available = true;
        this.ReservationQueue = new String[10];
    }

    public boolean pinjamBuku(User user) {
        if (!user.dapatPinjam()) {
            System.out.println("User sudah mencapai limit peminjaman");
            return false;
        }
        if (this.Available) {
            this.Available = false;
            user.tambahkanBukuPinjam(this);
            return true;
        } else {
            System.out.println("Buku sedang dipinjam / Tidak Tersedia");
            return false;
        }
    }

    public boolean pinjamBuku(User user, String priority) {
        if (!user.dapatPinjam()) {
            System.out.println("User sudah mencapai limit peminjaman");
            return false;
        }
        if (this.Available) {
            this.Available = false;
            user.tambahkanBukuPinjam(this);
            return true;
        } else {
            tambahkanAntriReservasi(user.getUserID(), priority);
           
            return true;
        }
    }

    public void tambahkanAntriReservasi(String userID, String priority) {   
        for (int i = 0; i < this.ReservationQueue.length; i++) {
            if (this.ReservationQueue[i] == null) {
                this.ReservationQueue[i] = userID;
                System.out.println("User : " + userID + " telah ditambahkan ke antrian dengan prioritas " + priority);
                return;
            }
        }
    }   
    public void displayBookInfo() {
        System.out.println("Judul : " + this.Tittle);
        System.out.println("Pengarang : " + this.Author);
        System.out.println("ISBN : " + this.ISBN);
        System.out.println("Is Available : " + (Available ? "Yes" : "No"));

        System.out.println("DAFTAR RESERVASI");
        for (int i = 0; i < this.ReservationQueue.length; i++) {
            if (this.ReservationQueue[i] != null) {
                System.out.println(this.ReservationQueue[i]);
            }
        }
    }

    public void setTittle(String Tittle) {
        this.Tittle = Tittle;
    }

    public String getTittle() {
        return this.Tittle;
    }
}
