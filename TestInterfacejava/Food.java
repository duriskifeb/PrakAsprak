package TestInterfacejava;

public class Food extends Goods {
    private int weight; // Dalam gram

    public Food(String name, int quantity, double price, int weight) {
        super(name, quantity, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return quantity * price * weight;
    }

    @Override
    public void displayDetail() {
        double totalPrice = calculatePrice();
        System.out.println("Makanan " + name + " berat " + weight + "-gram berjumlah " +
                quantity + ", total harga Rp " + totalPrice);
    }
}