package OTWE_UTS;

import OTWE_UTS.Veichle;

public class MotorCycle extends Veichle {
    private String type; //ini add atribut tambahan, kenaapa dia sendiri karena dia nanti yang akan di panggil di main nya manggilnya di kreasikan di main

    public MotorCycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    public void startEngine() { //pernah erorr karena keterkaitan dengan import yang salah karena method ini mau di ambil dalam keadaan yang salah
        System.out.println("Motorcycle engine started with key.");
    }   

    @Override
    public String toString() {
        return super.toString() + ", Type " + type;
    }
}

// Kapan pakai @Override                   | Kenapa
// Override method dari superclass         |  Biar Java tahu kamu sedang override
// Implement method dari abstract class   | Wajib override semua abstract method
// Implement method dari interface       | Harus override method-nya
// Supaya tidak salah penulisan         | Java akan beri error kalau method-nya salah
