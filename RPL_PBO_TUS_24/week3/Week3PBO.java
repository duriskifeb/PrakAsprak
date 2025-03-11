/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author ThinkPad
 */
public class Week3PBO {
    

    public static void main(String[] args) {
        
        vehicle SAT = new vehicle("B1234ABC", 100);
        SAT.DisplayInfo();
        System.out.println("Travel time for 500 km: " + SAT.calculateTravelTime(500) + " hours");
        System.out.println();
        
        vehicle DUA = new vehicle("T5678XYZ", 501, 6, "Truck");
        DUA.DisplayInfo();
        System.out.println("Travel time for 500 km with custom speed 60 km/h: " + DUA.calculateTravelTime(500, 60) + " hours");
    }
}

     

