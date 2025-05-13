package TestInterfacejava;

public class Food extends Goods {
    private int Weight;

    public Food(String name, int quantity, double price, int Weight) {
        super(name, quantity, price);
        this.Weight = Weight;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public double calculatePrice() {
        return quantity * price;
    }

    @Override
    public void displayDetail() {
        double totalPrice = calculatePrice();
        System.out.println("Makanan " + name + " berat " + +"-gram berjumlah " +
                quantity + ", total harga Rp " + totalPrice);
    }
}
