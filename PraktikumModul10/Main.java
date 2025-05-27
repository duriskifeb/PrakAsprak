package PraktikumModul10;

public class Main {
    public static void main(String[] args) {
        Electronic e = new Electronic("Smartphone", 2, 18000000, "iPhone 14");
        Food f = new Food("Lamington", 4, 75_000, 0.35);
        Cigarette c = new Cigarette("Dunhill Blue", 30, 3000, 20);

        e.displayDetail();
        f.displayDetail();
        c.displayDetail();
    }
}
