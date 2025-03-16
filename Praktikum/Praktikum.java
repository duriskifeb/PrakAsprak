/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author Ruben
 */
public class Praktikum {
    public static void main(String[] args){
        Book javaProgramming= new Book ("Java programming", "john", "12345");
        Book dataStructures= new Book ("Data Structures", "Michael", "56789");
        
        System.out.println("Display book info");
        
        System.out.println("");
        javaProgramming.displayBookInfo();
        
        System.out.println("");
        dataStructures.displayBookInfo();
        
        User alice = new User ("Alice", "M001","Mahasiswa" );
        User bob = new User ("Bob" , "D001", "dosen");
        
        javaProgramming.borrowBook(bob);
        javaProgramming.borrowBook(alice, "MID");
        
        dataStructures.borrowBook(alice);
        dataStructures.borrowBook(bob, "HIGH");
        
        //tampilkan buku dipinjam
        System.out.println("");
        System.out.println("Bob"); // jarak
        bob.displayBorrowedBooks();
        
        System.out.println(""); // jarak
        
        System.out.println("Alice");
        alice.displayBorrowedBooks();
        
        System.out.println("");
        System.out.println("Display Book Info");
        
        System.out.println("");//jarak
        javaProgramming.displayBookInfo();
        
        System.out.println("");//jarak
        dataStructures.displayBookInfo();
        
        
        


        
        
              
        
        
        
    }
    
}
