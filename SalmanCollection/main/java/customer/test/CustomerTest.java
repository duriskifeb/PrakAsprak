/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer.test;

/**
 *
 * @author Aditya
 */
import customer.biz.*;
import customer.Customer;
import Util.MissionUtil;
import java.util.HashMap;
public class CustomerTest {
    public static void main(String[] args){
        CustomerBiz custBiz = new CustomerBiz();
        custBiz.initializeCustomer();
        
        while(true){
            printMenu();
            int pilihan = 0;
            
            System.out.println("## Input Menu: "); 
            
            try{
                pilihan = Integer.parseInt(MissionUtil.getUserInput());
                switch(pilihan){
                case 1:
                    System.out.println("--------------------Informasi Pelanggan-----------------------");
                    custBiz.printAllCustomer();
                    System.out.println("--------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------");
                    System.out.println("Tambahkan informasi pelanggan");
                    System.out.println("Masukkan informasi pelanggan baru");
                    System.out.println("----------------");
                    
                    System.out.println("> nama: ");
                    String namaPelangganBaru = MissionUtil.getUserInput();
                    
                    System.out.println("> usia: ");
                    int usiaPelangganBaru = Integer.parseInt(MissionUtil.getUserInput());
                    
                    System.out.println("> No telepon [HP]: ");
                    String noHpPelangganBaru = MissionUtil.getUserInput();
                    
                    System.out.println("> No telepon [OFFICE]: ");
                    String noOfficePelangganBaru = MissionUtil.getUserInput();
                    
                    System.out.println("> No telepon [HP/OFFICE]: ");
                    String perwakilanPelangganBaru = MissionUtil.getUserInput();
                    
                    HashMap<String, String> phonePelangganBaru = new HashMap<String, String>();
                    phonePelangganBaru.put("HP", noHpPelangganBaru);
                    phonePelangganBaru.put("OFFICE", noOfficePelangganBaru);
                    phonePelangganBaru.put("PERWAKILAN", perwakilanPelangganBaru);
                    
                    custBiz.insertCustomer(namaPelangganBaru, usiaPelangganBaru, phonePelangganBaru);
                    break;
                case 3:
                    System.out.println("----------------");
                    System.out.println("edit usia pelanggan");
                    System.out.println("----------------");
                    
                    System.out.println("> Nomor pelanggan yang akan diedit: ");
                    int noPelanggan = Integer.parseInt(MissionUtil.getUserInput());
                    
                    System.out.println("> Informasi usia yang akan diedit: ");
                    int editUsia = Integer.parseInt(MissionUtil.getUserInput());
                    
                    custBiz.changeAge(noPelanggan, editUsia);
                    break;
                case 4:
                    System.out.println("--------------------");
                    System.out.println("edit nomor telepon pelanggan");
                    System.out.println("--------------------");
                        
                    System.out.println("> Nomor pelanggan yang akan diedit");
                    int noTeleponPelanggan = Integer.parseInt(MissionUtil.getUserInput());
                        
                    System.out.println("> No telepon yang akan di edit [HP] : ");
                    String hpPelanggan = MissionUtil.getUserInput();
                        
                    System.out.println("> No telepon yang akan di edit [OFFICE] : ");
                    String officePelanggan = MissionUtil.getUserInput();
                        
                    System.out.println("> no perwakilan [HP/OFFICE] : ");
                    String perwakilanPelanggan = MissionUtil.getUserInput();
                        
                    HashMap<String, String> phonePelanggan = new HashMap<>();
                    phonePelanggan.put("HP", hpPelanggan);
                    phonePelanggan.put("OFFICE", officePelanggan);
                    phonePelanggan.put("PERWAKILAN", perwakilanPelanggan);
                        
                    custBiz.changePhone(noTeleponPelanggan, phonePelanggan);
                        
                    System.out.println("-------------------------");
                    break;

                case 5:
                    System.out.println("--------------------");
                    System.out.println("menghapus informasi pelanggan");
                    System.out.println("--------------------");
                        
                    System.out.println("> Nama : ");
                    int noPelangganDiHapus = Integer.parseInt(MissionUtil.getUserInput());
                        
                    custBiz.deleteCustomer(noPelangganDiHapus);

                    break;
                case 9:
                    System.out.println("-----------------------");
                    System.out.println("END BYE~ BYE~");
                    System.out.println("-----------------------");
                    break;
                default:
                    break;
                      
            }
            
            }catch(Exception e){
                
            }
        }
    }
    
    public static void printMenu(){
        System.out.println("==<< Program Manajemen Pelanggan >>==");
        System.out.println("1. Mendapatkan Informasi Semua Pelanggan");
        System.out.println("2. Tambah Informasi Pelanggan");
        System.out.println("3. Edit Usia Pelanggan");
        System.out.println("4. Edit Nomor Telepon Pelanggan");
        System.out.println("5. Hapus Informasi Pelanggan");
        System.out.println("9. Keluar Sistem");
        System.out.println("===============================");
    }
}
