/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanempat;

import java.util.Scanner;

public class Oper {
    public static void main(String[] args) {
        try {
            processInput();
        } catch (NumberFormatException e) {
            System.out.println("Koordinat harus berupa integer. Silakan coba lagi.");
        }
    }
    public static void processInput() throws NumberFormatException {
        try (Scanner input = new Scanner(System.in)) {
            int x0 = 0, y0 = 0, x1 = 0, y1 = 0;
            boolean inputValid = false;

            while (!inputValid) {
                System.out.print("Koordinat x0: ");
                x0 = Integer.parseInt(input.nextLine());
                
                System.out.print("Koordinat y0: ");
                y0 = Integer.parseInt(input.nextLine());
                
                System.out.print("Koordinat x1: ");
                x1 = Integer.parseInt(input.nextLine());
                
                System.out.print("Koordinat y1: ");
                y1 = Integer.parseInt(input.nextLine());

                inputValid = true;
            }

            int luas = hitungLuas(x0, y0, x1, y1);
            System.out.println("Luas segi empat adalah: " + luas);
        }
    }

    public static int hitungLuas(int x0, int y0, int x1, int y1) {
        int panjang = Math.abs(x1 - x0);
        int lebar = Math.abs(y1 - y0);
        return panjang * lebar;
    } 
}
