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
public class Pisces extends Animalia{
    private String alatNafas;
    private String warna;

    public String getAlatNafas() {
        System.out.print("Aku bernafas menggunakan ");
        return alatNafas;
    }

    public void setAlatNafas(String alatNafas) {
        this.alatNafas = alatNafas;
    }

    public String getWarna() {
        System.out.print("Aku berwarna ");
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}
