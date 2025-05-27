package PraktikumModul10;

public abstract class PasenggerGoods {
    private String name;
    protected int quantity;
    private double price;

    public PasenggerGoods(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected double getPrice() {
        return price;
        
    }

    public abstract double calculatePrice();

    public abstract void displayDetail();
}

 