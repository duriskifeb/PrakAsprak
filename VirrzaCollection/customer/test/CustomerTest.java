package customer.test;

import customer.biz.CustomerBiz;
import util.MissionUtil;
import customer.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author VirzaAbsyar
 */
public class CustomerTest {

    public static void main(String[] args) {
        CustomerBiz customerBiz = new CustomerBiz();
        customerBiz.initializeCustomer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("## Input menu : ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next(); // Bersihkan input tidak valid
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Bersihkan newline setelah nextInt()

            switch (choice) {
                case 1:
                    customerBiz.printAllCustomer();
                    break;
                case 2:
                    String name = MissionUtil.getUserInput("Masukkan nama: ");
                    
                    // Input usia
                    int age = 0;
                    boolean valid = false;
                    while (!valid) {
                        try {
                            System.out.print("Masukkan usia: ");
                            age = Integer.parseInt(scanner.nextLine());
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Usia harus berupa angka.");
                        }
                    }

                    // Input nomor HP dan Kantor
                    HashMap<String, String> phone = new HashMap<>();
                    phone.put("HP", MissionUtil.getUserInput("Masukkan nomor HP: "));
                    phone.put("Office", MissionUtil.getUserInput("Masukkan nomor kantor: "));

                    customerBiz.insertCustomer(name, age, phone);
                    break;
                case 3:
                    // Ubah usia
                    int number = 0;
                    valid = false;
                    while (!valid) {
                        try {
                            System.out.print("Masukkan nomor pelanggan: ");
                            number = Integer.parseInt(scanner.nextLine());
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Nomor pelanggan harus berupa angka.");
                        }
                    }

                    int newAge = 0;
                    valid = false;
                    while (!valid) {
                        try {
                            System.out.print("Masukkan usia baru: ");
                            newAge = Integer.parseInt(scanner.nextLine());
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Usia harus berupa angka.");
                        }
                    }

                    customerBiz.changeAge(number, newAge);
                    break;
                case 4:
                    // Ubah nomor telepon
                    int num = 0;
                    valid = false;
                    while (!valid) {
                        try {
                            System.out.print("Masukkan nomor pelanggan: ");
                            num = Integer.parseInt(scanner.nextLine());
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Nomor pelanggan harus berupa angka.");
                        }
                    }

                    HashMap<String, String> newPhone = new HashMap<>();
                    newPhone.put("HP", MissionUtil.getUserInput("No telepon yang akan di edit(HP) "));
                    newPhone.put("OFFICE", MissionUtil.getUserInput("No telepon yang akan di edit(OFFICE) "));
                    newPhone.put("PERWAKILAN", MissionUtil.getUserInput("No Perwakilan (HP/OFFICE) "));
                    
                    System.out.println(newPhone);
                    
                    customerBiz.changePhone(num, newPhone);
                    break;
                case 5:
                    // Hapus pelanggan
                    int deleteNumber = 0;
                    valid = false;
                    while (!valid) {
                        try {
                            System.out.print("Masukkan nomor pelanggan untuk dihapus: ");
                            deleteNumber = Integer.parseInt(scanner.nextLine());
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Nomor pelanggan harus berupa angka.");
                        }
                    }

                    customerBiz.deleteCustomer(deleteNumber);
                    break;
                case 9:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tampilkan semua pelanggan");
        System.out.println("2. Tambah pelanggan");
        System.out.println("3. Ubah usia pelanggan");
        System.out.println("4. Ubah nomor telepon pelanggan");
        System.out.println("5. Hapus pelanggan");
        System.out.println("9. Keluar");
    }
}