package TestInterfacejava;

public class Main {
    public static void main(String[] args) {
        Electronic smartphone = new Electronic("smartphone", "Iphone 16 pro max", 10, 15000000);
        
        //buat objek Food
        Food foods = new Food("Sate Ayam ", 5, 15000, 350);

        //di buat objek Cigarette
        Cigarette cigratee = new Cigarette("Sampoerna mild", 8, 16500, 12);

        //this print the detail of the object
        System.out.println("-= Detail Electronic =-");
        smartphone.displayDetail();

        System.out.println("-= Detail Food =-");
        foods.displayDetail();

        System.out.println("-= Detail Cigarette =-");
        cigratee.displayDetail();
    }
}
