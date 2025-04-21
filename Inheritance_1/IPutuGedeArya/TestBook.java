public class BookTest {
    public static void testBook() {
        Book book = new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15);
        System.out.println("Testing Book:");
        System.out.println(book); // Uji toString()
    }

    public static void testSecondBook() {
        SecondBook secondBook = new SecondBook("Penjelajah warisan budaya", "Yoo Hong-Jun", 13000, 1, 45, "IU");
        System.out.println("Testing SecondBook:");
        System.out.println(secondBook); // Uji toString()
    }

    public static void main(String[] args) {
        testBook();
        testSecondBook();
    }
}