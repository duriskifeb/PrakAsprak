/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.stevan.praktikum_1;

/**
 *
 * @author Stevan
 */
public class soal_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] numbers = {10, 21, 33, 42, 51, 64, 79, 80};
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                total += numbers[i];
            }
        }
        System.out.println("\nJumlah bilangan ganjil adalah " + total + ".");
    }
}
