/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package LatihanW4;

/**
 *
 * @author asthiseta
 */
public class Week4Pbo {

    public static void main(String[] args) {
        Book javaProgramming = new Book("Java Programming", "John", "12345");
        Book dataStructures = new Book("Data Structures", "Michael", "67890");
        Book algorithm = new Book("Algorithm", "Reeves", "123912");
        
        User alice = new User("Alice", "M001", "Mahasiswa");
        User bob = new User("Bob" ,"D001", "Dosen");
        User bebek = new User("Bebek" ,"U001");
        
        System.out.println("");
        System.out.println("Alice meminjam buku " + javaProgramming.getTitle());
        javaProgramming.borrowBook(alice);
        
        System.out.println("");
        System.out.println("Bob meminjam buku " + javaProgramming.getTitle());
        javaProgramming.borrowBook(bob, "HIGH");
        
        System.out.println("");
        System.out.println("Bob meminjam buku " + dataStructures.getTitle());
        dataStructures.borrowBook(bob);
        
        System.out.println("");
        System.out.println("Alice meminjam buku " + dataStructures.getTitle());
        dataStructures.borrowBook(alice, "MID");
        
        System.out.println("");
        System.out.println("Bebek meminjam buku " + algorithm.getTitle());
        algorithm.borrowBook(bebek, "LOW");
        
        System.out.println("");
        System.out.println("Alice meminjam buku " + algorithm.getTitle());
        algorithm.borrowBook(alice, "MID");
        
        System.out.println("");
        System.out.println("Bob meminjam buku " + algorithm.getTitle());
        algorithm.borrowBook(bob, "HIGH");
        
        
        System.out.println("");
        alice.displayBorrowedBooks();
        
        System.out.println("");
        bob.displayBorrowedBooks();
        
        System.out.println("");
        bebek.displayBorrowedBooks();
        
        System.out.println("");
        algorithm.displayBookInfo();
        
        System.out.println("");
        dataStructures.displayBookInfo();
        
        System.out.println("");
        javaProgramming.displayBookInfo();
        
        
        
        
    }
}
