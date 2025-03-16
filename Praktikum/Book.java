/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author Ruben
 */
public class Book {

    private String title, author, isbn;
    private boolean available;
    private String[] reservationQueue;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

        this.available = true;

        this.reservationQueue = new String[10];

    }

    public boolean borrowBook(User user) {
    if (!user.canBorrow()) {
        System.out.println("User tidak bisa meminjam (limit)");
    }
    if (this.available) {
        System.out.println("Buku Tersedia untuk Peminjaman");
        System.out.println("Menambahkan ke Peminjaman");
        user.addBorrowedBook(this);
        this.available = false;
        return true;
    } else {
        System.out.println();
        return false;
    }
}

    public boolean borrowBook(User user, String priority) {
        return false;

    }

    public void addToReservationQueue(String userId, String priority) {

        for (int i = 0; i < this.reservationQueue.length; i++) {

            if (this.reservationQueue[1] == null) {
                this.reservationQueue[1] = userId;
                System.out.println("User" + userId + " added to the reservation queue with priority" + priority);

            }
            System.out.println("Reservation Queue is full");
            return;
        }
    }

    public void displayBookInfo() {
        System.out.println("judul : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN : " + this.isbn);

        System.out.println("Is Available :" + (available ? "YES" : "NO"));

        System.out.println("Daftar reservasi");
        for (int i = 0; i < this.reservationQueue.length; i++) {
            if (this.reservationQueue[i] != null) {
                System.out.println(this.reservationQueue[i]);

            }
        }

    }

    public void setTiltle(String title) {
        this.title = title;
    }

    public String getTiltle() {
        return this.title;

    }

}
