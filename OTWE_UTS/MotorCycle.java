package OTWE_UTS;

import OTWE_UTS.Veichle;

public class MotorCycle extends Veichle {
    private String type;

    public MotorCycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    public void startEngine() { //pernah erorr karena keterkaitan dengan import yang salah karena method ini mau di ambil dalam keadaan yang salah
        System.out.println("Motorcycle engine started with key.");
    }   

    public String toString() {
        return super.toString() + ", Type " + type;
    }
}
