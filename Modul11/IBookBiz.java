package Modul11;

public interface IBookBiz {
    void printAllBooks();
    void searchNovelByAuthor(String author);
    void searchNovelByPrice(int minPrice, int maxPrice);
}