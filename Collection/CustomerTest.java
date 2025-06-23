package Collection;

import java.util.HashMap;

/**
 *
 * @author asthiseta
 */
public class CustomerTest {

    public static void main(String[] args) {
        CustomerBiz custBiz = new CustomerBiz();
        custBiz.initializeCustomer();
        1
    }

    public static void printMenu() {
        System.out.println("== << Program Manajemen Pelanggan >> ==");
        System.out.println("1. Mendapat Informasi Semua Pelanggan");
        System.out.println("2. Tambahkan Informasi Pelanggan");
        System.out.println("3. Edit Usia Pelanggan");
        System.out.println("4. Edit Nomor Telepon Pelanggan");
        System.out.println("5. Hapus Informasi Pelanggan");
        System.out.println("9. Keluar Sistem");
        System.out.println("===============================");
    }
}