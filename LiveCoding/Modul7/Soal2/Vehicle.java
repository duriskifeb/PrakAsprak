package Modul7.Soal2;

public abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //method abstrak startEnggine nanti di panggil di anaknya class
    public abstract void startEngine(); 

    @Override
    public String toString() {
        return "Brand : " + brand + "year : " + year;
    }




    
}