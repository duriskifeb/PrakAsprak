package TestInterfacejava;

public class Cigarette extends Goods implements Taxable {
    private int piecePerPack;

    public Cigarette(String name, int quantity, double price, int piecePerPack) {
        super(name, quantity, price);
        this.piecePerPack = piecePerPack;
    }

    public int getPiecePerPack() {
        return piecePerPack;
    }

    public void setPiecePerPack(int piecePerPack) {
        this.piecePerPack = piecePerPack;
    }

    @Override
    public double calculatePrice() {
        if (piecePerPack < 12) {
            return quantity * price;
        } else if (piecePerPack <= 24) {
            return quantity * price * 1.5;
        } else {
            return quantity * price * (piecePerPack / 10.0);
        }
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * TAX_RATE;
    }

    @Override
    public void displayDetail() {
        double totalPrice = calculatePrice();
        double tax = calculateTax();
        System.out.println("Rokok " + name + " berjumlah " + quantity + " bungkus @" +
                piecePerPack + " batang, harga Rp " + totalPrice +
                " dan pajak Rp " + tax);
    }
}
