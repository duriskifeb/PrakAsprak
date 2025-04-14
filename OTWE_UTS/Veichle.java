package OTWE_UTS;

public abstract class Veichle {
    private String brand;
    private int year;

    public Veichle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //buat start to enggine
    public abstract void startEngine();

    

    @Override
    public String toString() {
        return "Brand : " + brand + ", Year : " + year;
    }
}
