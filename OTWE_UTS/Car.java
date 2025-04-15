package OTWE_UTS;

import OTWE_UTS.Veichle;

public class Car extends Veichle{
    //tambahan  private atribut sesuai modul
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("car enggine started with button");
    }

    @Override
    public String toString() {
            return super.toString() + ", Doors : " + numDoors;
    }
}
