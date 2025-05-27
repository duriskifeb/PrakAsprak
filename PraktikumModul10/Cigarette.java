package PraktikumModul10;

public class Cigarette extends PasenggerGoods implements Taxable {
    private int piecePerPack;

    public Cigarette(String name, int quantity, double price, int piecePerPack) {
        super(name, quantity, price);
        this.piecePerPack = piecePerPack;
    }

    @Override
    public double calculatePrice() {
        if (piecePerPack < 12) {
            return quantity * getPrice();
        } else if (piecePerPack <= 24) {
            return quantity * getPrice() * 1.5;
        } else {
            return quantity * getPrice() * ((double) piecePerPack / 10);
        }   
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * TAX_RATE;
    }

    @Override
    public void displayDetail() {
        double harga = calculatePrice();
        double pajak = calculateTax();
        System.out.println("Rokok " + getName() + " berjumlah " + quantity + " bungkus @" +
                piecePerPack + " batang, harga Rp " + harga + " dan pajak Rp " + pajak);
    }
}
