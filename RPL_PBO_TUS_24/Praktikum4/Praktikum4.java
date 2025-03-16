/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Praktikum4;

/**
 *
 * @author ASUS
 */
public class Praktikum4 {

    public static void main(String[] args) {
        Book javaProgramming = new Book("Java Programming", "John", "12345");
        Book dataStructures = new Book("Data Structures", "Michael", "67890");
        
        System.out.println("Display book info");
        System.out.println(" ");
        
        javaProgramming.displayBookInfo();
        System.out.println(" ");
        
        dataStructures.displayBookInfo();
        
        //Instansiasi objek user
        User alice = new User("Alice", "M001", "Mahasiswa");
        User bob = new User("Bob", "D001", "Dosen");
        
        //peminjaman buku
        javaProgramming.borrowBook(bob);
        javaProgramming.borrowBook(alice, "MID");
        
        System.out.println(" ");
        
        dataStructures.borrowBook(alice);
        dataStructures.borrowBook(bob, "HIGH");
        
        //Tampilan buku dipinjam
        System.out.println(" ");
        System.out.println("Bob"); //jarak
        bob.displayBorrowedBooks();
        
        System.out.println(" ");
        
        System.out.println("Alice");
        alice.displayBorrowedBooks();
        
        System.out.println(" ");
        System.out.println("Display Book Info");
        
        System.out.println(" "); //jarak
        javaProgramming.displayBookInfo();
        
        System.out.println(" ");//jarak
        dataStructures.displayBookInfo();
        
        
    }
}
