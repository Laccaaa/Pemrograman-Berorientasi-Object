package pertemuanempat;

import java.util.Scanner;

public class UtamaCustomException {
    public static void main(String[] args) {
        
        try {
            prosesKoordinat();
        } catch (MeiException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void prosesKoordinat() throws MeiException {
        Scanner scanner = new Scanner(System.in);

        int x0, y0, x1, y1;

        // Ambil input dari pengguna
        System.out.print("Masukkan koordinat x0: ");
        x0 = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan koordinat y0: ");
        y0 = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan koordinat x1: ");
        x1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan koordinat y1: ");
        y1 = Integer.parseInt(scanner.nextLine());

        if (x0 > x1 || y0 > y1) {
            throw new MeiException("Koordinat awal harus lebih kecil dari koordinat akhir.");
        }

        System.out.println("Koordinat valid. Lanjutkan proses.");
    }
}
