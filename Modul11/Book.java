package Modul11;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("%-20s | %10s", title, MissionUtil.moneyFormat(price));
    }
}