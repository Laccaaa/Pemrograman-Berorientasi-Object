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
public class Spermatophyta extends Plantae{
    private String reproduksi;
    private int ukuran;

    /**
     * @return the reproduksi
     */
    public String getReproduksi() {
        System.out.print("Aku berkembangbiak menggunakan ");
        return reproduksi;
    }

    /**
     * @param reproduksi the reproduksi to set
     */
    public void setReproduksi(String reproduksi) {
        this.reproduksi = reproduksi;
    }

    /**
     * @return the ukuran
     */
    public int getUkuran() {
        System.out.print("Aku berukuran ");
        return ukuran;
    }

    /**
     * @param ukuran the ukuran to set
     */
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
}
