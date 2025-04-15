package OTWE_UTS;

import OTWE_UTS.Veichle;

public class Car extends Veichle{
    //tambahan  private atribut sesuai modul
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);// kalo gak nulisin ini mka yang terjadi adalah kamu harus nulisin satu satu, dari induk class nya, pusing kon padahal itu milik dari induk class nya 
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

    //sekarang penjelasan mengenai super()
    //sesuatu yang ingin di akses di super class induk
    //sifatnya kek maksa gitu ini keyword super
}
