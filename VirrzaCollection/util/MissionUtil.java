/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author VirzaAbsyar
 */
public class MissionUtil {
     private static Scanner scanner = new Scanner(System.in);
    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
