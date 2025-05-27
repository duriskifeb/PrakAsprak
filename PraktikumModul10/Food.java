package PraktikumModul10;

public class Food extends PasenggerGoods {
    private double weight;

    public Food(String name, int quantity, double price, double weight) {
        super(name, quantity, price);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return quantity * getPrice() * weight;
    }

    @Override
    public void displayDetail() {
        double harga = calculatePrice();
        System.out.println("Makanan " + getName() + " berat " + weight + "-gram berjumlah " + quantity +
                ", total harga Rp " + harga);
    }
}
