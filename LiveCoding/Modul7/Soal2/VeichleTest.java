package Modul7.Soal2;

public class VeichleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2021, 4);

        //memanggil si car
        car.startEngine();
        System.out.println(car.toString());

        Vehicle motorCycle = new MotorCycle("Motor Cycle", 2020, "Sport");

        //memangil si motor Cycle
        motorCycle.startEngine();
        System.out.println(motorCycle.toString());

    }
}
