package Modul7.Soal2;

import Modul7.Soal2.Vehicle;

public class MotorCycle extends Vehicle {
    private String type;

    public MotorCycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    //method startEnggine dari class Veichle induknya
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with key.");
    }

    //lanjutkan toString sama kaya yg di classs Car persis tinggal ngerubah type nya aja sama pakek super
    @Override
    public String toString() {
        return super.toString() + ", Type " + type;
    }

}
