/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.stevan.praktikum_1;

/**
 *
 * @author Stevan
 */
public class soal_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Konversi suhu celcius dan fahrentheit secara berdampingan");

        System.out.println("Celcius   Fahrenheit   |   Fahrenheit   Celcius");
        int countCel = 20;
        for (int i = 0; i <= 98; i += 2, countCel += 5) {
            if (i % 2 == 0 && i <= 98) {
                double fah = 9.0 / 5.0 * i + 32;
                System.out.print(i + "   " + fah + "   |   ");
            }

            double cel = 5.0 / 9.0 * (countCel - 32);
            System.out.println(countCel + "   " + cel);
        }
    }
}
