package TestInterfacejava;

public class Electronic extends Goods implements Taxable {
    private String type;

    public Electronic(String name, String type, int quantity, double price) {
        super(name, quantity, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calculatePrice() {
        return quantity * price;
    }

    @Override
    public double calculateTax() {
        double totalPrice = calculatePrice();
        if (totalPrice > 7500000) {
            return (totalPrice - 7500000) * TAX_RATE;
        }
        return 0;
    }

    @Override
    public void displayDetail() {
        double totalPrice = calculatePrice();
        double tax = calculateTax();
        System.out.println("Nama barang " + name + " dengan tipe " + type +
                " berjumlah " + quantity + " dengan total harga Rp " +
                totalPrice + " dengan total pajak Rp " + tax);
    }
}