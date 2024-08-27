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
public class Reptilia extends Animalia{
    private int gantiKulit;
    private int jumlahJantung;
    
    public Reptilia(){
        this.gantiKulit = 0;
        this.jumlahJantung = 0;
    }

    /**
     * @return the gantiKulit
     */
    public int getGantiKulit() {
        System.out.print("Aku mengganti kulitku setiap ");
        return gantiKulit;
    }

    /**
     * @param gantiKulit the gantiKulit to set
     */
    public void setGantiKulit(int gantiKulit) {
        this.gantiKulit = gantiKulit;
    }

    /**
     * @return the jumlahJantung
     */
    public int getJumlahJantung() {
        System.out.print("Aku memiliki jantung sebanyak ");
        return jumlahJantung;
    }

    /**
     * @param jumlahJantung the jumlahJantung to set
     */
    public void setJumlahJantung(int jumlahJantung) {
        this.jumlahJantung = jumlahJantung;
    }
}
