/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author Ruben
 */
public class User {
    private String name, userId, userType;
    private int borrowLimit, borrowDuration;
    private Book[] borrowedBook;
    
            
    public User(String name, String userId){
        this.name = name;
        this.userId = userId;
        this.userType = "Anggota lainnya";
        
        this.borrowLimit = 3;
        this.borrowDuration = 7;
        this.borrowedBook = new Book[this.borrowLimit];
    }
        
  public User(String name, String userId, String userType){
        this.name = name;
        this.userId = userId;
        this.userType = userType;
        
        if(this.userType.equalsIgnoreCase("mahasiswa") ){
            this.borrowLimit = 5;
            this.borrowDuration = 14;
            
     }else if (this.userType.equalsIgnoreCase ("dosen")){
         this.borrowLimit = 10;
         this.borrowDuration = 30;
         
     } else{
         this.userType = "Anggota Lainnya";
         this.borrowLimit = 3;
         this.borrowDuration = 7;
         
     }     
    
    this.borrowedBook = new Book[this.borrowLimit];
 
  }
 
  public boolean canBorrow(){
      for(int i = 0; i < borrowLimit; i++){
          if(this.borrowedBook[i]== null) {
          return true;
      }
      }
          return false;
      }
      
 public void addBorrowedBook(Book book){
     for(int i = 0; i < this.borrowedBook.length; i++){
       if(this.borrowedBook[i] == null){
           this.borrowedBook[i] = book;
           System.out.println("Berhasil Meninjam Buku");
           return;
       }
     }
     System.out.println("User Limit");
 }
 public void displayBorrowedBooks(){
     for (int i = 0; i < this.borrowedBook.length; i++){
         if(this.borrowedBook[i] != null){
            System.out.println(this.borrowedBook[1].getTiltle());
         }
     }
 }
 
 public String getUserId(){
     return this.userId;
 }
 public String getUserType(){
     return this.userType;
 }
}
