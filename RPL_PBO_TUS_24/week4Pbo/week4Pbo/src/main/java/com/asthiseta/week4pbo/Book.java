/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asthiseta.week4pbo;

/**
 *
 * @author asthiseta
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
            System.out.println("User tidak bisa meminjam buku");
            return false;
        }

        if (this.available) {
            System.out.println("Buku Tersedia Untuk Dipinjam");
            System.out.println("Menambahkan ke peminjaman");
            user.addBorrowedBook(this);
            this.available = false;
            return true;
        } else {
            System.out.println("Buku Tidak Tersedia Untuk Dipinjam");
            return false;
        }
    }

    public boolean borrowBook(User user, String priority) {
        // priority : HIGH, MEDIUM, LOW : Dosen, Mahasiswa, Anggota Lainnya (respectively)
        if (!user.canBorrow()) {
            System.out.println("User tidak bisa meminjam buku");
            return false;
        }

        if (this.available) {
            System.out.println("Buku Tersedia Untuk Dipinjam");
            System.out.println("Menambahkan ke peminjaman");
            user.addBorrowedBook(this);
            this.available = false;
            return true;
        } else {
            System.out.println("Buku Tidak Tersedia Untuk Dipinjam");

            addToReservationQueue(user.getUserId(), priority);

            return true;
        }
    }

    public void displayBookInfo() {
        System.out.println("Info Buku");
        System.out.println("Judul : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN : " + this.isbn);
        System.out.println("Is Available : " + (this.available ? "Yes" : "No"));

        System.out.println("Daftar Reservasi : ");
        for (int i = 0; i < this.reservationQueue.length; i++) {
            if (this.reservationQueue[i] != null) {
                System.out.println(this.reservationQueue[i]);
            }
        }

    }

    public void addToReservationQueue(String userId, String priority) {
        System.out.println("Menambahkan ke daftar reservasi");
        String prevUserId = "";
        for (int i = 0; i < this.reservationQueue.length; i++) {
            if (this.reservationQueue[i] == null) {

                if (userId.contains("D") && prevUserId.contains("M") || userId.contains("M") && prevUserId.contains("U")) {
                    // Swap
                    this.reservationQueue[i] = this.reservationQueue[i - 1];
                    this.reservationQueue[i - 1] = userId;
                } else {
                    reservationQueue[i] = userId;
                }
                System.out.println("User " + userId + " added to the reservation queue with priority " + priority);
                return;
            } else {
                prevUserId = reservationQueue[i];
            }
        }
        System.out.println("Daftar Reservasi Penuh");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
