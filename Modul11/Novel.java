package Modul11;

public class Novel extends Book {
    private String author;

    public Novel(String title, int price, String author) {
        super(title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%-12s | %-20s | %10s", author, getTitle(), MissionUtil.moneyFormat(getPrice()));
    }
}