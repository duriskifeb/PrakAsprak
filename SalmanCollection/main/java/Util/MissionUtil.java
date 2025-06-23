/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Aditya
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MissionUtil {
    public static String getUserInput(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String data = "";
        try{
            data = input.readLine();
        }catch(Exception e){
            
        }
        return data;
    }       
}
