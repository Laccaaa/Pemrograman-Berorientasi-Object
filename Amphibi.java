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
public class Amphibi extends Animalia{
    private String jenisKulit;
    private int jumlahJariKaki;

    /**
     * @return the jenisKulit
     */
    public String getJenisKulit() {
        System.out.print("Aku memiliki kulit yang ");
        return jenisKulit;
    }

    /**
     * @param jenisKulit the jenisKulit to set
     */
    public void setJenisKulit(String jenisKulit) {
        this.jenisKulit = jenisKulit;
    }

    /**
     * @return the jumlahJariKaki
     */
    public int getJumlahJariKaki() {
        System.out.print("Aku memiliki jari sebanyak ");
        return jumlahJariKaki;
    }

    /**
     * @param jumlahJariKaki the jumlahJariKaki to set
     */
    public void setJumlahJariKaki(int jumlahJariKaki) {
        this.jumlahJariKaki = jumlahJariKaki;
    }
    
}
