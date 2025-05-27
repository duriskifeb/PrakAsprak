package PraktikumModul10;

public class Electronic extends PasenggerGoods implements Taxable {
    private String type;

    public Electronic(String name, int quantity, double price, String type) {
        super(name, quantity, price);
        this.type = type;
    }

    @Override
    public double calculatePrice() {
        return quantity * getPrice();
    }

    @Override
    public double calculateTax() {
        double harga = calculatePrice();
        if (harga <= 7500000)
            return 0;
        return (harga - 7500000) * TAX_RATE;
    }

    @Override
    public void displayDetail() {
        double harga = calculatePrice();
        double pajak = calculateTax();
        System.out.println("Nama barang " + getName() + " dengan tipe " + type + " berjumlah " + quantity +
                " dengan total harga Rp " + harga + " dengan total pajak Rp " + pajak);
    }
}
