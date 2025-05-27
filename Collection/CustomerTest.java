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
        while (true) {
            printMenu();
            System.out.print("## Input menu: ");
            int pilihan = Integer.parseInt(MissionUtil.getUserInput());
            switch (pilihan) {
                case 1:
                    System.out.println("----------------------------Informasi Pelanggan----------------------------");
                    custBiz.printAllCustomer();
                    System.out.println("--------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("------------------");
                    System.out.println("tambahkan informasi pelanggan baru");
                    System.out.println("masukkan informasi pelanggan baru");
                    System.out.println("------------------");

                    System.out.print("> nama: ");
                    String nama = MissionUtil.getUserInput();

                    System.out.print("> usia: ");
                    int umur = Integer.parseInt(MissionUtil.getUserInput());

                    System.out.print("> No telepon [HP]: ");
                    String noHp = MissionUtil.getUserInput();

                    System.out.print("> No telepon [OFFICE]: ");
                    String noOffice = MissionUtil.getUserInput();

                    System.out.print("> No perwakilan (HP/OFFICE): ");
                    String nmrPerwakilan = MissionUtil.getUserInput();

                    HashMap<String, String> custPhone = new HashMap<>();
                    custPhone.put("OFFICE", noOffice);
                    custPhone.put("HP", noHp);
                    custPhone.put("PERWAKILAN", nmrPerwakilan);

                    custBiz.insertCustomer(nama, umur, custPhone);

                    break;
                case 3:
                    System.out.println("------------------");
                    System.out.println("Edit Usia Pelanggan");
                    System.out.println("------------------");
                    System.out.print("> Nomor pelanggan yang akan diedit: ");
                    int nomor = Integer.parseInt(MissionUtil.getUserInput());

                    System.out.print("> Informasi usia yang akan diedit: ");
                    int usia = Integer.parseInt(MissionUtil.getUserInput());

                    custBiz.changeAge(nomor, usia);
                    System.out.println("------------------");
                    break;
                case 4:
                    System.out.println("------------------");
                    System.out.println("Ubah No telepon Pelanggan");
                    System.out.println("------------------");
                    System.out.print("> Nomor pelanggan yang akan di edit: ");
                    int nomorPelanggan = Integer.parseInt(MissionUtil.getUserInput());

                    System.out.print("> Nomor telepon yang akan di edit (HP): ");
                    String noHpBaru = MissionUtil.getUserInput();

                    System.out.print("> Nomor telepon yang akan di edit (OFFICE): ");
                    String noOfficeBaru = MissionUtil.getUserInput();

                    System.out.print("> Nomor perwakilan (HP/OFFICE): ");
                    String noPerwakilan = MissionUtil.getUserInput();

                    HashMap<String, String> phone = new HashMap<>();
                    phone.replace("OFFICE", noOfficeBaru);
                    phone.replace("HP", noHpBaru);
                    phone.replace("PERWAKILAN", noPerwakilan);

                    custBiz.changePhone(nomorPelanggan, phone);

                    System.out.println("------------------");

                    break;
                case 5:
                    System.out.println("------------------");
                    System.out.println("Menghapus Informasi Pelanggan");
                    System.out.println("------------------");

                    System.out.print("> Nomor pelanggan yang akan dihapus: ");
                    int no = Integer.parseInt(MissionUtil.getUserInput());

                    custBiz.deleteCustomer(no);
                    System.out.println("------------------");
                    break;
                case 9:
                    System.out.println("------------------");
                    System.out.println("End. Bye~ Bye~");
                    System.out.println("------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }

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