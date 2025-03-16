/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author ASUS
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private String[] reservationQueue;
    
    
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        
        this.available = true;
        this.reservationQueue = new String[10];
        
    }
    
    
    //method
    public boolean borrowBook(User user) {
        if(!user.canBorrow()) {
            System.out.println("User Tidak bisaMeminjam (Limit)");
            return false;
        }
        
        if(this.available) {
            available = false;
            user.addBorrowedBook(this);
            return true;
        }else{
            System.out.println("User Tidak bisa Meminjam (limit)");
            return true;
        }
    }
    
    public boolean borrowBook(User user, String priority) {
        if(!user.canBorrow()) {
            System.out.println("User Tidak bisaMeminjam (Limit)");
            return false;
        }
        
        if(this.available) {
            available = false;
            user.addBorrowedBook(this);
            return true;
        }else{
            addToReservationQueue(user.getUserId(), priority);
            return true;
        }
    }
    
    public void addToReservationQueue(String userId, String priority){
        // reservationQueue[1] = userId
        for(int i = 0; i < this.reservationQueue.length; i++) {
            if(this.reservationQueue[i] == null) {
                this.reservationQueue[i] = userId;
                System.out.println("user" + userId + " added to the reservation queue with priority" + priority);
                return;
            }
        }
        
        System.out.println("Reservation Queue is full");
    }
    
    public void displayBookInfo() {
        System.out.println("Judul : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN : " + this.isbn);
        
        System.out.println("is Available : " + (available ? "YES" : "NO"));
        
        System.out.println("Daftar Reservasi : ");
        for(int i = 0; i < this.reservationQueue.length; i++){
            if (this.reservationQueue[i] != null) {
                System.out.println(this.reservationQueue[i]);
            }
        }
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    
    
       
}
