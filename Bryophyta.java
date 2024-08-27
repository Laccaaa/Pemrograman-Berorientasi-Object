/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpertama;

/**
 *
 * @author LENOVO
 */
public class Bryophyta extends Plantae{
    private String kembangBiak;
    private int umur;

    /**
     * @return the kembangBiak
     */
    public String getKembangBiak() {
        System.out.print("Aku berkembangbiak menggunakan ");
        return kembangBiak;
    }

    /**
     * @param kembangBiak the kembangBiak to set
     */
    public void setKembangBiak(String kembangBiak) {
        this.kembangBiak = kembangBiak;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        System.out.println("Aku tumbuh sampai berumur ");
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
