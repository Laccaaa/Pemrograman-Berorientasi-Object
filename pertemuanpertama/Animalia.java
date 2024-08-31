/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanpertama;

public class Animalia extends MakhlukHidup{
    protected int jumlahKaki;
    protected String habitat;
    protected String reproduksi;
    
     public Animalia() {
        this.jumlahKaki = 0;
        this.habitat = "";
        this.reproduksi = "";
    }

    public int getJumlahKaki() {
        System.out.print("Aku memiliki kaki sebanyak ");                
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public String getHabitat() {
        System.out.print("Aku tinggal di ");
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getReproduksi() {
        System.out.print("Aku berkembang biak dengan cara ");
        return reproduksi;
    }

    public void setReproduksi(String reproduksi) {
        this.reproduksi = reproduksi;
    }
    
}
