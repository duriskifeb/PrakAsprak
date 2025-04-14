package OTWE_UTS;


public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2021, 4);
        MotorCycle motorcycle = new MotorCycle("Yamaha", 2020, "Sport");

        car.startEngine();
        System.out.println(car.toString());

        motorcycle.startEngine();
        System.out.println(motorcycle.toString());
    }
}
