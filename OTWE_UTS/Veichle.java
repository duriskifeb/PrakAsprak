package OTWE_UTS;

public abstract class Veichle {
    private String brand;
    private int year;

    //akes modifier - retrun - namaMethod
    //Constructor :
    //akses modifier - nama kelas (isi dari paramerter)
    public Veichle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //buat start to enggine
    //abstract di sini method yang hanya di deklarasikan tanpa ada isi body 
    //dan akan di paksa implement oleh kelas turunya 
    // abstract harus di overid di kelas anaknya 
    public abstract void startEngine();

    
    //buato to String
    @Override
    public String toString() {
        return "Brand : " + brand + ", Year : " + year;
    }
}
