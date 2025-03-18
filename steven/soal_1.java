/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package steven;

/**
 *
 * @author Stevan
 */
public class soal_1 {
    
    public static void main(String[] args) {
        int num = 64;
        Boolean isGenap = false;
        Boolean isKelipatanTiga = false;
        Boolean isKelipatanTujuh = false;
        
        if (num % 2 == 0) {
            isGenap = true;
        }
        if (num % 3 == 0) {
            isKelipatanTiga = true;
        }
        if (num % 7 == 0) {
            isKelipatanTujuh = true;
        }
        String hasil = isGenap ? "benar" : "salah";
        System.out.println("Apakah itu bilangan genap? : " + hasil);
        
        hasil = isKelipatanTiga ? "benar" : "salah";
        System.out.println("Apakah kelipatan 3? : " + hasil);
        
        hasil = (isGenap && isKelipatanTujuh) ? "benar" : "salah";
        System.out.println("Apakah kelipatan 2 dan kelipatan 7? : " + hasil);
        
        hasil = (isGenap || isKelipatanTujuh) ? "benar" : "salah";
        System.out.println("Apakah kelipatan 2 atau kelipatan 7? : " + hasil);
    }
}
