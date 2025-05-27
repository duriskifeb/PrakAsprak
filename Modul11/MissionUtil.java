package Modul11;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MissionUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Input harus berupa angka. Silakan masukkan lagi: ");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return input;
    }

    public static String getStringInput() {
        return scanner.nextLine();
    }

    public static String moneyFormat(int price) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(price);
    }
}