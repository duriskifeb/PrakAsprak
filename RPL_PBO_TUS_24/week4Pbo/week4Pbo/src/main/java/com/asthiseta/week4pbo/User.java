/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asthiseta.week4pbo;

/**
 *
 * @author asthiseta
 */
public class User {

    private String name, userId, userType;
    private int borrowLimit, borrowDuration;
    private Book[] borrowedBooks;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.userType = "Anggota Lainnya";
        this.borrowLimit = 3;
        this.borrowDuration = 7;

        this.borrowedBooks = new Book[this.borrowLimit];
    }

    public User(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;

        switch (userType) {
            case "Dosen":
                this.borrowLimit = 7;
                this.borrowDuration = 30;
                break;
            case "Mahasiswa":
                this.borrowLimit = 5;
                this.borrowDuration = 14;
                break;
            default:
                this.userType = "Anggota Lainnya";
                this.borrowLimit = 3;
                this.borrowDuration = 7;
                break;
        }

        this.borrowedBooks = new Book[this.borrowLimit];
    }

    public boolean canBorrow() {
        // check if the borrowLimit is full by checking the last index
        return this.borrowedBooks[this.borrowLimit - 1] == null;
    }

    public void addBorrowedBook(Book book) {
        System.out.println(this.name + " Borrowing a " + book.getTitle());
        for (int i = 0; i < this.borrowLimit; i++) {
            if (this.borrowedBooks[i] == null) {
                this.borrowedBooks[i] = book;
                System.out.println("Book is added to borrowed list");
                return;
            }
        }
        System.out.println("User can't borrow book anymore");
    }

    public void displayBorrowedBooks() {
        System.out.println("Buku yang dipinjam oleh " + this.name);
        for (int i = 0; i < this.borrowLimit; i++) {
            if (this.borrowedBooks[i] != null) {
                System.out.println(this.borrowedBooks[i].getTitle());
            }
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
