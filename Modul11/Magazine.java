package Modul11;

public class Magazine extends Book {
    private String category;
    private String description;

    public Magazine(String title, int price, String category, String description) {
        super(title, price);
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-20s | %10s | [%s]", category, getTitle(), MissionUtil.moneyFormat(getPrice()),
                description);
    }
}