/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author ASUS
 */
public class User {
    private String name, userId, userType;
    private int borrowLimit, borroDuration;
    private Book[] borrowedBook;
    
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.userType = "Anggota lainnya" ;
        
        this.borrowLimit = 3;
        this.borroDuration = 7;
        this.borrowedBook = new Book[this.borrowLimit];
        
    }
    
    public User(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
        
        if(this.userType.equalsIgnoreCase("Mahasiswa")) {
            this.borrowLimit = 5;
            this.borroDuration = 14;
        }else if(this.userType.equalsIgnoreCase("Dosen")){
            this.borrowLimit= 10;
            this.borroDuration = 30;
        }else {
            this.userType = "Anggota Lainnya";
            //Anggota Lain
            this.borrowLimit = 3;
            this.borroDuration = 7;
        }
        
        this.borrowedBook = new Book [this.borrowLimit];
    }
    
    public boolean canBorrow(){
        for (int i=0; i< borrowLimit; i++) {
        if(this.borrowedBook[i] == null) {
        return true;
        }
     }
       return false; 
       
    }
    
    public void addBorrowedBook(Book book){
        for(int i=0; i < this.borrowedBook.length; i++) {
            if(this.borrowedBook[i] == null) {
                this.borrowedBook[i] = book;
                return;
            }
        }
        System.out.println("user limit");
    }
    
    public void displayBorrowedBooks() {
        System.out.println("Buku dipinjamkan :");
        for(int i=0; i < this.borrowedBook.length; i++) {
            if(this.borrowedBook[i] != null) {
                System.out.println(this.borrowedBook[i].getTitle());
            }
        }
    }
    
    public String getUserId(){
        return this.userId;
    }
    
    public String getUserType() {
        return this.userType;
    }
    
    
}
