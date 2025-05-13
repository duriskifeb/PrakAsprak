package TestInterfacejava;

public abstract class Goods implements Product {
    protected String name;
    protected int quantity;
    protected double price;

    //seperti biasa Constructor
    public Goods(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    //getter setter 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //abstract method
    @Override
    public abstract double calculatePrice();

    @Override
    public abstract void displayDetail();
}


