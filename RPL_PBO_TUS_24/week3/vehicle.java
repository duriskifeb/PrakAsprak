/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author ThinkPad
 */
public class vehicle{

    private String plateNumber;
    private double speed;
    private int numWheels;
    private String vehicleType;

    public vehicle(String plateNumber ,double speed) {
    this.plateNumber=plateNumber;
    this.speed=speed;
    
    }

    public vehicle(String plateNumber ,double speed , int numWheels ,String vehicleType) {
    this.plateNumber=plateNumber;
    this.speed=speed;
    this.vehicleType=vehicleType;
    this.numWheels=numWheels;
    
    }
     
    void DisplayInfo(){
        
    System.out.println("informasion vhicle");
    System.out.println("platNumber :" +plateNumber);
    System.out.println("speed :"+ speed);
    System.out.println("numWheels :"+vehicleType);
    System.out.println("vehicleType :"+numWheels);
    }
    
    
    
   public double calculateTravelTime (double jarak){
       double hasil= jarak*speed;
       return hasil;
    }
 
    public double calculateTravelTime(double jarak, double customSpeed) {
        return jarak / customSpeed;
    }

//    public void setSpeed(double speed) {
//        this.speed = speed;
//    }
}

