package Chandra;

public class Uhuk {
    

    public static void main(String[] args) {
        Book JavaProgramming = new Book ("Java Programming","John","12345");
        Book StrukturData = new Book("DataStructure", "Michael", "67890");

        System.out.println("Display Book Info : ");
        
        System.out.println("");
        JavaProgramming.displayBookInfo();

        System.out.println("");
        StrukturData.displayBookInfo();

        User alice = new User("Alice", "M001", "Mahasiswa");
        User Bob = new User("BodyPublisher", "D001", "Dosen");
        User John = new User("John", "D002", "Dosen");

        JavaProgramming.pinjamBuku(John);
        JavaProgramming.pinjamBuku(Bob);
        JavaProgramming.pinjamBuku(alice,"Mid");

        StrukturData.pinjamBuku(alice);
        StrukturData.pinjamBuku(Bob,"High");

        System.out.println("");
        System.out.println("John" );
        John.displayBukuPinjaman();

        System.out.println("");
        System.out.println("Bob");
        Bob.displayBukuPinjaman();

        System.out.println("");
        System.out.println("alice");
        alice.displayBukuPinjaman();

        System.out.println("");
        System.out.println("Display Book Info : ");

        System.out.println("");
        JavaProgramming.displayBookInfo();
        
        System.out.println("");
        StrukturData.displayBookInfo();

    }
}
    

